package com.ricardococati.repository.dao.impl;

import com.ricardococati.model.dto.CandlestickDiarioDTO;
import com.ricardococati.model.dto.SplitInplit;
import com.ricardococati.repository.dao.GenericDAO;
import com.ricardococati.repository.dao.ICandlestickDiarioDAO;
import com.ricardococati.repository.dao.mapper.CandlestickDiarioMapper;
import com.ricardococati.repository.dao.sqlutil.CandlestickDiarioSQLUtil;
import com.ricardococati.repository.util.SQLAppender;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class CandlestickDiarioDAO implements ICandlestickDiarioDAO {

  @Qualifier("namedParameterJdbcTemplate")
  private final NamedParameterJdbcTemplate template;

  private final GenericDAO genericDAO;
  private final CandlestickDiarioSQLUtil sqlUtil;
  private final CandlestickDiarioMapper mapper;

  @Override
  public Boolean incluirCandlestickDiario(final CandlestickDiarioDTO candlestickDiarioDTO) {
    int retorno = 0;
    final SQLAppender sql = new SQLAppender(100);
    try {
      candlestickDiarioDTO.setIdCandleDiario(
          genericDAO.getSequence("CANDLESTICK_SEQ", template).longValue()
      );
      retorno = template.update(sqlUtil.getInsert(), sqlUtil.toParameters(candlestickDiarioDTO));
    } catch (Exception ex) {
      log.error("Erro na execução do método CANDLESTICK_DIARIO: " + ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

  @Override
  public Boolean split(final SplitInplit splitInplit) {
    int retorno = 0;
    final String operacao = "/";
    try {
      retorno = template.update(sqlUtil.getUpdate(operacao),
          sqlUtil.toParametersUpdate(splitInplit));
    } catch (Exception ex) {
      log.error("Erro na execução do método split: " + ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

  @Override
  public Boolean inplit(final SplitInplit splitInplit) {
    int retorno = 0;
    final String operacao = "*";
    try {
      retorno = template.update(sqlUtil.getUpdate(operacao),
          sqlUtil.toParametersUpdate(splitInplit));
    } catch (Exception ex) {
      log.error("Erro na execução do método inplit: " + ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

  @Override
  public List<CandlestickDiarioDTO> buscaCandleDiarioPorCodNeg(String codneg) {
    return template.query(
        sqlUtil.getSelectByCodNeg(),
        sqlUtil.toParametersCodNeg(codneg),
        (rs, rowNum) -> mapper.mapper(rs)
    );
  }

  @Override
  public List<String> getListCodNegMediaSimplesFalse() {
    return template.query(
        sqlUtil.getSelectCodNegMediaSimplesFalse(),
        (rs, rowNum) -> mapper.mapperCodNeg(rs)
    );
  }

  @Override
  public List<String> getListCodNegMediaExponencialFalse() {
    return template.query(
        sqlUtil.getSelectCodNegMediaExponencialFalse(),
        (rs, rowNum) -> mapper.mapperCodNeg(rs)
    );
  }

  @Override
  public Boolean updateCandlestickDiario() {
    int retorno = 0;
    try {
      retorno = template.update(sqlUtil.getUpdateMediaMovel(),
          new MapSqlParameterSource());
    } catch (Exception ex) {
      log.error("Erro na execução do método update: " + ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

  @Override
  public List<String> getListCodNeg() {
    return template.query(
        sqlUtil.getSelectCodNeg(),
        (rs, rowNum) -> mapper.mapperCodNeg(rs)
    );
  }

  @Override
  public Boolean updateCandleDiarioMediaSimplesGeradaByCodNeg(final String codneg) {
    int retorno = 0;
    try {
      retorno = template.update(sqlUtil.getUpdateMediaMovelByCodneg(),
          sqlUtil.toParametersCodNeg(codneg));
    } catch (Exception ex) {
      log.error("Erro na execução do método update: " + ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

  @Override
  public Boolean updateCandleDiarioMediaExponencialGeradaByCodNeg(final String codneg) {
    int retorno = 0;
    try {
      retorno = template.update(sqlUtil.getUpdateMediaExponencialByCodneg(),
          sqlUtil.toParametersCodNeg(codneg));
    } catch (Exception ex) {
      log.error("Erro na execução do método update: " + ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

  @Override
  public Boolean updateCandleDiarioMacdGeradaByCodNeg(final String codneg) {
    int retorno = 0;
    try {
      retorno = template.update(sqlUtil.getUpdateMacdByCodneg(),
          sqlUtil.toParametersCodNeg(codneg));
    } catch (Exception ex) {
      log.error("Erro na execução do método update: " + ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

  @Override
  public Boolean updateCandleDiarioSinalMacdGeradaByCodNeg(String codneg) {
    int retorno = 0;
    try {
      retorno = template.update(sqlUtil.getUpdateSinalMacdByCodneg(),
          sqlUtil.toParametersCodNeg(codneg));
    } catch (Exception ex) {
      log.error("Erro na execução do método update: " + ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

}
