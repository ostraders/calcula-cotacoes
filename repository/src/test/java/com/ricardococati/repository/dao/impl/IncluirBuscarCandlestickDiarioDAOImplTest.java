package com.ricardococati.repository.dao.impl;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import com.ricardococati.model.dto.CandlestickDTO;
import com.ricardococati.model.dto.CandlestickDiarioDTO;
import com.ricardococati.repository.dao.BaseOccurrenceJdbcTest;
import com.ricardococati.repository.dao.GenericDAO;
import com.ricardococati.repository.dao.sqlutil.InserirCandlestickDiarioSQLUtil;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class IncluirBuscarCandlestickDiarioDAOImplTest extends BaseOccurrenceJdbcTest {

  @InjectMocks
  private InserirCandlestickDiarioDAOImpl target;
  @Mock
  private GenericDAO genericDAO;
  @Mock
  private InserirCandlestickDiarioSQLUtil sqlUtil;
  private Integer countInteger;
  private LocalDate dtpreg;

  @Before
  public void setUp() {
    this.countInteger = 0;
    this.dtpreg = LocalDate.of(1978, 02, 16);
    target = new InserirCandlestickDiarioDAOImpl(getNamedParameterJdbcTemplate(), genericDAO, sqlUtil);
  }

  @Test
  public void incluirCandlestickDiario() {
    //given
    when(genericDAO.getSequence(any(), any())).thenReturn(1);
    when(sqlUtil.getInsert()).thenCallRealMethod();
    when(sqlUtil.toParameters(any())).thenCallRealMethod();
    CandlestickDiarioDTO dto = buildCandlestickDiarioDTO("MGLU3", 10.1, dtpreg.plusDays(countInteger += 1));
    //when
    Boolean retorno = target.insereCandlestickDiario(dto);
    //then
    assertTrue(retorno);
  }

  private CandlestickDiarioDTO buildCandlestickDiarioDTO(
      final String codneg,
      final Double preult,
      final LocalDate dtpreg
  ) {
    return CandlestickDiarioDTO
        .builder()
        .dtpreg(dtpreg)
        .candlestickDTO(CandlestickDTO
            .builder()
            .preult(new BigDecimal(preult).setScale(4, BigDecimal.ROUND_HALF_UP))
            .codneg(codneg)
            .build()
        ).build();
  }

}