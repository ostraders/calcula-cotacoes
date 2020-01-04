package com.ricardococati.repository.dao.impl;

import com.ricardococati.model.dto.SinalMacdSemanal;
import com.ricardococati.repository.dao.GenericDAO;
import com.ricardococati.repository.dao.SinalMacdSemanalDAO;
import com.ricardococati.repository.dao.mapper.SinalMacdSemanalMapper;
import com.ricardococati.repository.dao.sqlutil.SinalMacdSemanalSQLUtil;
import com.ricardococati.repository.util.SQLAppender;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class SinalMacdSemanalDAOImpl implements SinalMacdSemanalDAO {

  @Qualifier("namedParameterJdbcTemplate")
  private final NamedParameterJdbcTemplate template;

  private final GenericDAO genericDAO;
  private final SinalMacdSemanalSQLUtil sqlUtil;
  private final SinalMacdSemanalMapper mapper;

  @Override
  public Boolean incluirSinalMacd(List<SinalMacdSemanal> macdList) {
    AtomicInteger retorno = new AtomicInteger(0);
    final SQLAppender sql = new SQLAppender(100);
    try {
      macdList
          .stream()
          .forEach(sinalMacd -> {
            sinalMacd.setIdSinalMacdSemanal(
                genericDAO.getSequence("SINAL_MACD_SEMANAL_SEQ", template).longValue()
            );
            retorno.addAndGet(template.update(sqlUtil.getInsert(), sqlUtil.toParameters(sinalMacd)));
          });
    } catch (Exception ex) {
      log.error("Erro na execução do método incluir SINAL_MACD: " + ex.getMessage());
      throw ex;
    }
    return retorno.get() > 0;
  }

  @Override
  public Boolean deleteAllSinalMacd() {
    return template.update(sqlUtil.getDelete(), new MapSqlParameterSource()) == 0;
  }

  @Override
  public List<SinalMacdSemanal> listSinalMacdByCodNeg(String codneg) {
    return template.query(
        sqlUtil.getSelectByCodNeg(),
        sqlUtil.toParametersByCodNeg(codneg),
        (rs, rowNum) -> mapper.mapper(rs)
    );
  }
}