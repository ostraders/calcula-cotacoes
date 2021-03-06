package com.ricardococati.calculacotacoes.adapters.repositories.recomendacao.impl;

import static java.util.Objects.isNull;

import com.ricardococati.calculacotacoes.adapters.repositories.gerasequencia.impl.GeraSequenciaDAOImpl;
import com.ricardococati.calculacotacoes.adapters.repositories.recomendacao.RecomendacaoDiarioInserirDAO;
import com.ricardococati.calculacotacoes.adapters.repositories.recomendacao.sqlutil.RecomendacaoDiarioInserirSQLUtil;
import com.ricardococati.calculacotacoes.entities.domains.recomendacao.RecomendacaoDiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class RecomendacaoDiarioInserirDAOImpl implements RecomendacaoDiarioInserirDAO {

  @Qualifier("namedParameterJdbcTemplate")
  private final NamedParameterJdbcTemplate template;

  private final GeraSequenciaDAOImpl genericDAO;
  private final RecomendacaoDiarioInserirSQLUtil sqlUtil;

  @Override
  public Boolean incluirRecomendacao(final RecomendacaoDiario recomendacaoDiario) {
    if (isNull(recomendacaoDiario)
        || isNull(recomendacaoDiario.getDtpreg())
        || isNull(recomendacaoDiario.getRecomendacao())
        || isNull(recomendacaoDiario.getRecomendacao().getCodneg())) {
      throw new DataIntegrityViolationException(
          "Violação de integridade na inserção de RECOMENDACAO_DIARIO");
    }
    int retorno;
    try {
      recomendacaoDiario.setIdRecomendacaoDiario(
          genericDAO.getSequence("RECOMENDACAO_DIARIO_SEQ").longValue()
      );
      retorno = template.update(sqlUtil.getInsert(), sqlUtil.toParameters(recomendacaoDiario));
    } catch (Exception ex) {
      log.error("Erro na execução do método incluir RECOMENDACAO_DIARIO: " + ex.getMessage());
      throw ex;
    }
    return retorno > 0;
  }

}
