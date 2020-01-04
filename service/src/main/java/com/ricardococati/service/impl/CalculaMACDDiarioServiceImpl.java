package com.ricardococati.service.impl;

import com.ricardococati.model.dto.Macd;
import com.ricardococati.model.dto.MacdDiario;
import com.ricardococati.model.dto.MediaMovelExponencialDiario;
import com.ricardococati.model.enums.QuantidadePeriodo;
import com.ricardococati.repository.dao.MacdDiarioDAO;
import com.ricardococati.repository.dao.MediaMovelExponencialDiarioDAO;
import com.ricardococati.service.CalculaMACDDiarioService;
import com.ricardococati.service.BuscarCandlestickDiarioService;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Data
@Service
@RequiredArgsConstructor
public class CalculaMACDDiarioServiceImpl
    implements CalculaMACDDiarioService {

  private final BuscarCandlestickDiarioService candleDiarioService;
  private final MediaMovelExponencialDiarioDAO mmeDAO;
  private final MacdDiarioDAO macdDAO;

  private List<MediaMovelExponencialDiario> buscaMME12Periodo(final String codneg) {
    return mmeDAO.getListMMEByCodNegEPeriodo(
        codneg,
        QuantidadePeriodo.FAST_12.getQuantidade());
  }

  private List<MediaMovelExponencialDiario> buscaMME26Periodo(final String codneg) {
    return mmeDAO.getListMMEByCodNegEPeriodo(
        codneg,
        QuantidadePeriodo.SLOW_26.getQuantidade());
  }

  private Boolean calculaMACD(final String codneg) {
    List<MacdDiario> macdList = new ArrayList<>();
    final List<MediaMovelExponencialDiario> listMedia12 = buscaMME12Periodo(codneg);
    final List<MediaMovelExponencialDiario> listMedia26 = buscaMME26Periodo(codneg);
    for (MediaMovelExponencialDiario mme12 : listMedia12) {
      for (MediaMovelExponencialDiario mme26 : listMedia26) {
        if (mme12.getDtpreg().isEqual(mme26.getDtpreg())) {
          BigDecimal premacd = mme12.getMediaMovelExponencial().getPremedult()
              .subtract(mme26.getMediaMovelExponencial().getPremedult());
          macdList.add(
              buildMacd(mme26.getMediaMovelExponencial().getCodneg(), mme26.getDtpreg(), premacd));
        }
      }
    }
    macdDAO.incluirMacd(macdList);
    return Boolean.TRUE;
  }

  @Override
  public Boolean executeByCodNeg(String codneg) {
    log.info("Código de negociação: " + codneg);
    calculaMACD(codneg);
    return Boolean.TRUE;
  }

  private MacdDiario buildMacd(
      final String codneg,
      final LocalDate dtpreg,
      final BigDecimal prepremacd) {
    return MacdDiario.builder()
        .dtpreg(dtpreg)
        .macd(Macd.builder().codneg(codneg)
        .premacd(prepremacd).build())
        .build();
  }

}