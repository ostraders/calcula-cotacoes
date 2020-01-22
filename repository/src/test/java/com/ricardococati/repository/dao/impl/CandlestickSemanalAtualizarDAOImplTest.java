package com.ricardococati.repository.dao.impl;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import com.ricardococati.model.dto.CandlestickDTO;
import com.ricardococati.model.dto.CandlestickDiarioDTO;
import com.ricardococati.model.dto.CandlestickSemanalDTO;
import com.ricardococati.model.dto.SplitInplit;
import com.ricardococati.model.enums.OperacaoSplitInplit;
import com.ricardococati.repository.dao.BaseJdbcTest;
import com.ricardococati.repository.dao.sqlutil.CandlestickSemanalAtualizarSQLUtil;
import com.ricardococati.repository.dao.sqlutil.CandlestickSemanalInserirSQLUtil;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CandlestickSemanalAtualizarDAOImplTest extends BaseJdbcTest {

  @InjectMocks
  private CandlestickSemanalAtualizarDAOImpl target;
  @Mock
  private CandlestickSemanalAtualizarSQLUtil sqlUtil;
  @Mock
  private CandlestickSemanalInserirSQLUtil incluirSQLUtil;
  @Mock
  private GenericDAOImpl genericDAO;
  private LocalDate dtpregini;
  private LocalDate dtpregfim;

  @Before
  public void setUp() {
    this.dtpregini = LocalDate.of(1978, 2, 16);
    this.dtpregfim = dtpregini.plusDays(6);
    target = new CandlestickSemanalAtualizarDAOImpl(getNamedParameterJdbcTemplate(), sqlUtil);
    incluiCandleAntesDeExecutarTestes();
  }

  private void incluiCandleAntesDeExecutarTestes() {
    CandlestickSemanalInserirDAOImpl incluirDAO = new CandlestickSemanalInserirDAOImpl(
        getNamedParameterJdbcTemplate(), genericDAO, incluirSQLUtil);
    when(incluirSQLUtil.getInsert()).thenCallRealMethod();
    when(incluirSQLUtil.toParameters(any())).thenCallRealMethod();
    when(genericDAO.getSequence(any(), any())).thenReturn(1);
    incluirDAO.incluirCandlestickSemanal(
        buildCandlestickDiarioDTO(dtpregini, dtpregfim)
    );
  }

  @Test
  public void atualizaInplit() {
    SplitInplit splitInplit = build(LocalDate.now(), "INPLIT");
    when(sqlUtil.getUpdateSplitInplit(any())).thenCallRealMethod();
    when(sqlUtil.toParametersUpdateSplitInplit(any())).thenCallRealMethod();
    //when
    Boolean retorno = target.atualizaSplitInplit(splitInplit);
    //then
    assertTrue(retorno);
  }

  @Test
  public void atualizaSplit() {
    SplitInplit splitInplit = build(LocalDate.now(), "SPLIT");
    when(sqlUtil.getUpdateSplitInplit(any())).thenCallRealMethod();
    when(sqlUtil.toParametersUpdateSplitInplit(any())).thenCallRealMethod();
    //when
    Boolean retorno = target.atualizaSplitInplit(splitInplit);
    //then
    assertTrue(retorno);
  }

  private SplitInplit build(
      final LocalDate dtpreg,
      final String operacao
  ) {
    return SplitInplit
        .builder()
        .codneg("MGLU3")
        .dtpreg(dtpreg)
        .qtdSplitInplit(2)
        .operacao(OperacaoSplitInplit.valueOf(operacao))
        .build();
  }

  private CandlestickSemanalDTO buildCandlestickDiarioDTO(
      final LocalDate dtpregini,
      final LocalDate dtpregfim
  ) {
    return CandlestickSemanalDTO
        .builder()
        .dtpregini(dtpregini)
        .dtpregfim(dtpregfim)
        .candlestickDTO(CandlestickDTO
            .builder()
            .preult(new BigDecimal(10.1).setScale(4, BigDecimal.ROUND_HALF_UP))
            .codneg("MGLU3")
            .build()
        ).build();
  }

}