package com.ricardococati.service.impl;

import static java.util.Objects.nonNull;

import com.ricardococati.model.dto.CandlestickDTO;
import com.ricardococati.model.dto.CandlestickDiarioDTO;
import com.ricardococati.model.dto.MediaMovelSimplesDiario;
import com.ricardococati.model.enums.QuantidadePeriodo;
import com.ricardococati.repository.dao.IMediaMovelSimplesDiarioDAO;
import com.ricardococati.service.ICalculaMediaMovelSimplesDiarioService;
import com.ricardococati.service.ICandlestickDiarioService;
import com.ricardococati.service.converter.ConverteMediaMovelSimples;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Data
@Service
@RequiredArgsConstructor
public class CalculaMediaMovelSimplesDiarioService
    implements ICalculaMediaMovelSimplesDiarioService {

  private final ICandlestickDiarioService diarioService;
  private final ConverteMediaMovelSimples converteMediaMovelSimples;
  private final IMediaMovelSimplesDiarioDAO mediaMovelSimplesDAO;

  @Override
  public Boolean execute() {
    AtomicBoolean returned = new AtomicBoolean(true);
    if(returned.get()) {
      diarioService
          .listCodNegocioMediaSimplesFalse()
          .forEach(
              codigoNegocio -> {
                returned.set(executeByCodNeg(codigoNegocio));
                diarioService.atualizaCandleDiarioMediaSimplesGeradaByCodneg(codigoNegocio);
              });
    }
    return returned.get();
  }

  @Override
  public Boolean executeByCodNeg(final String codigoNegocio) {
    log.info("Código de negociação: " + codigoNegocio);
    List<CandlestickDiarioDTO> candlestickList =
        diarioService.listaCandlestickDiario(buildCandlestickDiarioDTO(codigoNegocio));
    List<MediaMovelSimplesDiario> mediaMovelSimplesList =
        calculaMediaMovelSimplesPorPeriodo(candlestickList, codigoNegocio);
    mediaMovelSimplesDAO.incluirMediaMovelSimples(mediaMovelSimplesList);
    return Boolean.TRUE;
  }

  private List<MediaMovelSimplesDiario> calculaMediaMovelSimplesPorPeriodo(
      List<CandlestickDiarioDTO> candlestickDiarios, String codneg) {
    List<MediaMovelSimplesDiario> mediaMovelSimplesList = new ArrayList<>();
    QuantidadePeriodo.getListQuantidadePeriodo()
        .stream()
        .filter(periodo -> nonNull(candlestickDiarios))
        .filter(periodo -> candlestickDiarios.size() >= periodo.intValue())
        .map(periodo -> calculaMediaMovelSimples(periodo, candlestickDiarios, codneg))
        .forEachOrdered(mediaMovelSimplesList::addAll);
    return mediaMovelSimplesList;
  }

  private List<MediaMovelSimplesDiario> calculaMediaMovelSimples(
      int periodo, List<CandlestickDiarioDTO> candlestickDiario, String codneg) {
    return IntStream.range(periodo - 1, candlestickDiario.size())
        .mapToObj(indice -> calcula(periodo, indice, candlestickDiario, codneg))
        .collect(Collectors.toList());
  }

  private MediaMovelSimplesDiario calcula(
      int periodo, int posicao, List<CandlestickDiarioDTO> candlestickDiarioList, String codneg) {
    double soma = 0.0;
    MediaMovelSimplesDiario mediaMovelSimples =
        converteMediaMovelSimples
            .converterCandlestickDiarioToMediaMovelSimples(buildCandlestickDiarioDTO(codneg));
    mediaMovelSimples.getMediaMovelSimples().setPeriodo(periodo);
    for (int indice = posicao - (periodo - 1); indice <= posicao; indice++) {
      CandlestickDiarioDTO candlestickDiario = candlestickDiarioList.get(indice);
      soma += candlestickDiario.getCandlestickDTO().getPreult().doubleValue();
      if (indice == posicao) {
        mediaMovelSimples.setDtpreg(candlestickDiario.getDtpreg());
        mediaMovelSimples.getMediaMovelSimples().setPremedult(new BigDecimal(soma / periodo));
      }
    }
    return mediaMovelSimples;
  }

  private CandlestickDiarioDTO buildCandlestickDiarioDTO(final String codneg) {
    return CandlestickDiarioDTO.builder()
        .candlestickDTO(CandlestickDTO.builder().codneg(codneg).build())
        .build();
  }
}
