package com.ricardococati.calculacotacoes.adapters.repositories.candlestick;

import static com.ricardococati.calculacotacoes.utils.geral.BigDecimalCustomizado.sendDoubleGetValueBigDecimalArredonda4Casas;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import com.ricardococati.calculacotacoes.adapters.repositories.candlestick.impl.CandlestickSemanalBuscarDAOImpl;
import com.ricardococati.calculacotacoes.adapters.repositories.candlestick.mapper.BuscarCandlestickSemanalMapper;
import com.ricardococati.calculacotacoes.adapters.repositories.candlestick.sqlutil.CandlestickDiarioInserirSQLUtil;
import com.ricardococati.calculacotacoes.adapters.repositories.candlestick.sqlutil.CandlestickSemanalBuscarSQLUtil;
import com.ricardococati.calculacotacoes.adapters.repositories.candlestick.sqlutil.CandlestickSemanalInserirSQLUtil;
import com.ricardococati.calculacotacoes.adapters.repositories.gerasequencia.impl.GeraSequenciaDAOImpl;
import com.ricardococati.calculacotacoes.config.BaseJdbcTest;
import com.ricardococati.calculacotacoes.entities.domains.candlestick.Candlestick;
import com.ricardococati.calculacotacoes.entities.domains.candlestick.CandlestickDiario;
import com.ricardococati.calculacotacoes.entities.domains.candlestick.CandlestickSemanal;
import com.ricardococati.calculacotacoes.adapters.repositories.utils.InserirDadosPrimariosSemanalUtil;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CandlestickSemanalBuscarDAOImplTest extends BaseJdbcTest {

  @InjectMocks
  private CandlestickSemanalBuscarDAOImpl target;
  @Mock
  private CandlestickSemanalBuscarSQLUtil sqlUtil;
  @Mock
  private BuscarCandlestickSemanalMapper mapper;
  @Mock
  private CandlestickSemanalInserirSQLUtil incluirSQLUtil;
  @Mock
  private CandlestickDiarioInserirSQLUtil incluirDiarioSQLUtil;
  @Mock
  private GeraSequenciaDAOImpl genericDAO;
  private LocalDate dtpregini;
  private LocalDate dtpregfim;

  @Before
  public void setUp() throws Exception {
    this.dtpregini = LocalDate.of(1978, 2, 16);
    this.dtpregfim = dtpregini.plusDays(6);
    target = new CandlestickSemanalBuscarDAOImpl(getNamedParameterJdbcTemplate(), sqlUtil, mapper);
    InserirDadosPrimariosSemanalUtil util = new InserirDadosPrimariosSemanalUtil(
        getNamedParameterJdbcTemplate(),
        buildCandlestick(dtpregini, dtpregfim),
        incluirSQLUtil,
        genericDAO,
        incluirDiarioSQLUtil,
        buildCandlestickDiarioDTO(dtpregini)
    );
    util.incluiCandleDiarioAntesDeExecutarTestes();
    util.incluiCandleAntesDeExecutarTestes();
  }

  @Test
  public void buscaCandleSemanalPorCodNeg() {
    //given
    String codneg = "MGLU3";
    when(sqlUtil.getSelectByCodNeg()).thenCallRealMethod();
    when(sqlUtil.toParametersCodNeg(any())).thenCallRealMethod();
    when(mapper.mapper(any())).thenCallRealMethod();
    //when
    List<CandlestickSemanal> result = target.buscaCandleSemanalPorCodNeg(codneg);
    //then
    assertTrue(!result.isEmpty());
    assertThat(result).isNotNull().size().isEqualTo(1);
    assertThat(result.get(0).getCandlestick().getCodneg()).isNotNull().isEqualTo("MGLU3");
    assertThat(result.get(0).getCandlestick().getPreult()).isNotNull()
        .isEqualTo(new BigDecimal("10.10"));
  }

  @Test
  public void buscaCandleSemanalPorDtPreg() {
    //given
    LocalDate dtpregLocal = dtpregini.minusDays(1);
    when(sqlUtil.getSelectCodNegByDtPreg()).thenCallRealMethod();
    when(sqlUtil.toParametersDtPreg(any())).thenCallRealMethod();
    when(mapper.mapperCodNeg(any())).thenCallRealMethod();
    //when
    List<String> result = target.buscaCandleSemanalPorDtPreg(dtpregLocal);
    //then
    assertTrue(!result.isEmpty());
    assertThat(result).isNotNull().size().isEqualTo(1);
    assertThat(result.get(0)).isNotNull().isEqualTo("MGLU3");
  }

  private CandlestickSemanal buildCandlestick(
      final LocalDate dtpregini,
      final LocalDate dtpregfim
  ) {
    return CandlestickSemanal
        .builder()
        .dtpregini(dtpregini)
        .dtpregfim(dtpregfim)
        .candlestick(Candlestick
            .builder()
            .preult(sendDoubleGetValueBigDecimalArredonda4Casas(10.1))
            .codneg("MGLU3")
            .build()
        ).build();
  }

  private CandlestickDiario buildCandlestickDiarioDTO(
      final LocalDate dtpreg
  ) {
    return CandlestickDiario
        .builder()
        .dtpreg(dtpreg)
        .candlestick(Candlestick
            .builder()
            .preult(sendDoubleGetValueBigDecimalArredonda4Casas(10.1))
            .codneg("MGLU3")
            .build()
        ).build();
  }

}