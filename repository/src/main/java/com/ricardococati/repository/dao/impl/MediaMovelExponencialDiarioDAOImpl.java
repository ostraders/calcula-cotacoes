package com.ricardococati.repository.dao.impl;

import com.ricardococati.model.dto.MediaMovelExponencialDiario;
import com.ricardococati.repository.dao.MediaMovelExponencialDiarioDAO;
import com.ricardococati.repository.dao.mapper.MediaMovelExponencialDiarioMapper;
import com.ricardococati.repository.dao.sqlutil.MediaMovelExponencialDiarioSQLUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MediaMovelExponencialDiarioDAOImpl implements MediaMovelExponencialDiarioDAO {

  @Qualifier("namedParameterJdbcTemplate")
  private final NamedParameterJdbcTemplate template;

  private final GeraSequenciaDAOImpl genericDAO;
  private final MediaMovelExponencialDiarioSQLUtil sqlUtil;
  private final MediaMovelExponencialDiarioMapper mediaMapper;

  @Override
  public Boolean incluirMediaMovelExponencial(
      final List<MediaMovelExponencialDiario> mediaMovelExponencialList) {
    AtomicInteger retorno = new AtomicInteger(0);
    try {
      mediaMovelExponencialList
          .stream()
          .forEach(mediaMovelSimples -> {
            mediaMovelSimples.setIdMediaMovelExponencialDiario(
                genericDAO.getSequence("MEDIA_MOVEL_EXPONENCIAL_DIARIO_SEQ").longValue()
            );
            retorno.addAndGet(
                template.update(sqlUtil.getInsert(), sqlUtil.toParameters(mediaMovelSimples)));
          });
    } catch (Exception ex) {
      log.error("Erro na execução do método CANDLESTICK_DIARIO: " + ex.getMessage());
      throw ex;
    }
    return retorno.get() > 0;
  }

  @Override
  public List<MediaMovelExponencialDiario> getListMME12ByCodNegEPeriodo(
      String codneg,
      Integer periodo
  ) {
    return template.query(
        sqlUtil.getSelectByCodNegEPeriodo(),
        sqlUtil.toParametersByCodNegEPeriodo(codneg, periodo),
        (rs, rowNum) -> mediaMapper.mapper(rs)
    );
  }

  @Override
  public List<MediaMovelExponencialDiario> getListMME26ByCodNegEPeriodo(
      String codneg,
      Integer periodo
  ) {
    return template.query(
        sqlUtil.getSelectByCodNegEPeriodo(),
        sqlUtil.toParametersByCodNegEPeriodo(codneg, periodo),
        (rs, rowNum) -> mediaMapper.mapper(rs)
    );
  }

}
