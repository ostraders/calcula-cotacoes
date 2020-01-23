package com.ricardococati.repository.dao.impl;

import static java.util.Objects.isNull;

import com.ricardococati.model.dto.CandlestickSemanalDTO;
import com.ricardococati.repository.dao.CandlestickSemanalInserirDAO;
import com.ricardococati.repository.dao.sqlutil.CandlestickSemanalInserirSQLUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class CandlestickSemanalInserirDAOImpl implements CandlestickSemanalInserirDAO {

  @Qualifier("namedParameterJdbcTemplate")
  private final NamedParameterJdbcTemplate template;

  private final GeraSequenciaDAOImpl genericDAO;
  private final CandlestickSemanalInserirSQLUtil sqlUtil;

  @Override
  public Boolean incluirCandlestickSemanal(CandlestickSemanalDTO semanal) {
    int retorno = 0;
    if (isNull(semanal)
        || isNull(semanal.getDtpregini())
        || isNull(semanal.getDtpregfim())
        || isNull(semanal.getCandlestickDTO().getCodneg())) {
      throw new DataIntegrityViolationException("Violação de chave na inserção de CANDLESTICK_SEMANAL");
    }
    try {
      semanal.setIdCandleSemanal(
          genericDAO.getSequence("CANDLESTICK_SEMANAL_SEQ").longValue()
      );
      retorno = template.update(sqlUtil.getInsert(), sqlUtil.toParameters(semanal));
    } catch (Exception ex) {
      log.error("Erro na execução do método CANDLESTICK_SEMANAL: {} ",  ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

}
