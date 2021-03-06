package com.ricardococati.calculacotacoes.usecases.histograma.impl;

import static java.util.Objects.nonNull;

import com.ricardococati.calculacotacoes.adapters.repositories.histograma.HistogramaDiarioInserirDAO;
import com.ricardococati.calculacotacoes.adapters.repositories.macd.MacdDiarioBuscarDAO;
import com.ricardococati.calculacotacoes.adapters.repositories.sinalmacd.SinalMacdDiarioBuscarDAO;
import com.ricardococati.calculacotacoes.entities.domains.histograma.Histograma;
import com.ricardococati.calculacotacoes.entities.domains.histograma.HistogramaDiario;
import com.ricardococati.calculacotacoes.entities.domains.macd.MacdDiario;
import com.ricardococati.calculacotacoes.entities.domains.sinalmacd.SinalMacdDiario;
import com.ricardococati.calculacotacoes.usecases.histograma.HistogramaDiarioCalculaService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Data
@Service
@RequiredArgsConstructor
public class HistogramaDiarioCalculaServiceImpl
    implements HistogramaDiarioCalculaService {

  private final MacdDiarioBuscarDAO macdDAO;
  private final SinalMacdDiarioBuscarDAO sinalMacdDAO;
  private final HistogramaDiarioInserirDAO histogramaDAO;

  @Override
  public List<HistogramaDiario> executeByCodNeg(String codneg) {
    log.info("Código de negociação: " + codneg);
    List<MacdDiario> macdList =
        macdDAO.listMacdByCodNeg(codneg);
    List<SinalMacdDiario> sinalMacdList =
        sinalMacdDAO.listSinalMacdByCodNeg(codneg);
    List<HistogramaDiario> histogramaList = calculaHistograma(macdList, sinalMacdList);
    insereHistograma(histogramaList);
    return histogramaList;
  }

  private void insereHistograma(List<HistogramaDiario> histogramaList) {
    histogramaList
        .parallelStream()
        .filter(Objects::nonNull)
        .filter(histogramaDiario -> nonNull(histogramaDiario.getDtpreg()))
        .filter(histogramaDiario -> nonNull(histogramaDiario.getHistograma()))
        .filter(histogramaDiario -> nonNull(histogramaDiario.getHistograma().getCodneg()))
        .forEach(histogramaDAO::incluirHistograma);
  }

  private List<HistogramaDiario> calculaHistograma(
      final List<MacdDiario> macdList,
      final List<SinalMacdDiario> sinalMacdList
  ) {
    List<HistogramaDiario> histogramaList = new ArrayList<>();
    if (nonNull(macdList) && nonNull(sinalMacdList)) {
      macdList.forEach(macd -> {
        sinalMacdList
            .stream()
            .filter(sinal ->
                sinal.getDtpreg().isEqual(macd.getDtpreg())
                    &&
                sinal.getSinalMacd().getCodneg().equals(macd.getMacd().getCodneg())
            )
            .map(sinal -> buildHistograma(macd, sinal))
            .filter(hist -> !histogramaList.contains(hist))
            .forEach(histogramaList::add);
      });
    }
    return histogramaList;
  }

  private HistogramaDiario buildHistograma(final MacdDiario macd, final SinalMacdDiario sinal) {
    return HistogramaDiario.builder()
        .dtpreg(macd.getDtpreg())
        .histograma(
            Histograma
                .builder()
                .codneg(macd.getMacd().getCodneg())
                .prehist(macd.getMacd().getPremacd()
                    .subtract(sinal.getSinalMacd().getPresinal()))
                .build())
        .build();
  }

}
