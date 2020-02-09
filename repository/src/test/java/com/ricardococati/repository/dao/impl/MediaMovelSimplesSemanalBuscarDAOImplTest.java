package com.ricardococati.repository.dao.impl;

import static br.com.six2six.fixturefactory.Fixture.from;
import static com.ricardococati.repository.dao.templates.MediaMovelSimplesSemanalTemplateLoader.MEDIA_MOVEL_SIMPLES_SEMANAL_VALID_001;
import static com.ricardococati.repository.dao.templates.MediaMovelSimplesSemanalTemplateLoader.MEDIA_MOVEL_SIMPLES_SEMANAL_VALID_002;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.ricardococati.model.dto.MediaMovelSimplesSemanal;
import com.ricardococati.repository.dao.config.BaseJdbcTest;
import com.ricardococati.repository.dao.mapper.MediaMovelSimplesSemanalMapper;
import com.ricardococati.repository.dao.sqlutil.MediaMovelSimplesSemanalSQLUtil;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MediaMovelSimplesSemanalBuscarDAOImplTest extends BaseJdbcTest {

  @InjectMocks
  private MediaMovelSimplesSemanalBuscarDAOImpl target;
  @Mock
  private MediaMovelSimplesSemanalSQLUtil sqlUtil;
  @Mock
  private MediaMovelSimplesSemanalMapper mapper;
  @Mock
  private GeraSequenciaDAOImpl genericDAO;
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() throws Exception {
    FixtureFactoryLoader.loadTemplates("com.ricardococati.repository.dao.templates");
    target = new MediaMovelSimplesSemanalBuscarDAOImpl(
        getNamedParameterJdbcTemplate(),
        sqlUtil,
        mapper
    );
    incluirMMSAntesDeExecutarTestes();
  }

  private void incluirMMSAntesDeExecutarTestes() {
    MediaMovelSimplesSemanalInserirDAOImpl incluirDAO =
        new MediaMovelSimplesSemanalInserirDAOImpl(
            getNamedParameterJdbcTemplate(),
            genericDAO,
            sqlUtil
        );
    when(sqlUtil.getInsert()).thenCallRealMethod();
    when(sqlUtil.toParameters(any())).thenCallRealMethod();
    when(genericDAO.getSequence(any())).thenReturn(1);
    mmsPeriodosList()
        .stream()
        .filter(Objects::nonNull)
        .forEach(incluirDAO::incluirMediaMovelSimples);
  }

  @Test
  public void buscaMediaSimplesPorCodNegPeriodoDtPreg() throws Exception {
    //given
    when(sqlUtil.getSelectByCodNegPeriodoDtPreg()).thenCallRealMethod();
    when(sqlUtil.toParametersSelectByCodNegPeriodoDtPreg(any(), any(), any(), any())).thenCallRealMethod();
    when(mapper.mapper(any())).thenCallRealMethod();
    //when
    final LocalDate dtpreg = LocalDate.of(1978, 2, 16);
    MediaMovelSimplesSemanal result =
        target.buscaMediaSimplesPorCodNegPeriodoDtPreg("MGLU3", 9, dtpreg, dtpreg.plusDays(2));
    //then
    assertThat(result).isNotNull();
    assertThat(result.getDtpregini()).isNotNull().isEqualTo(LocalDate.of(1978, 2, 16));
    assertThat(result.getMediaMovelSimples().getCodneg()).isNotNull().isEqualTo("MGLU3");
    assertThat(result.getMediaMovelSimples().getPeriodo()).isNotNull().isEqualTo(9);
    assertThat(result.getMediaMovelSimples().getPremedult()).isNotNull().isEqualTo(new BigDecimal("11.11"));
  }

  @Test
  public void buscaMediaSimplesPorCodNegPeriodoDtPregDia17() throws Exception {
    //given
    when(sqlUtil.getSelectByCodNegPeriodoDtPreg()).thenCallRealMethod();
    when(sqlUtil.toParametersSelectByCodNegPeriodoDtPreg(any(), any(), any(), any())).thenCallRealMethod();
    when(mapper.mapper(any())).thenCallRealMethod();
    //when
    final LocalDate dtpreg = LocalDate.of(1978, 2, 19);
    MediaMovelSimplesSemanal result =
        target.buscaMediaSimplesPorCodNegPeriodoDtPreg("MGLU3", 9, dtpreg, dtpreg.plusDays(1));
    //then
    assertThat(result).isNotNull();
    assertThat(result.getDtpregini()).isNotNull().isEqualTo(LocalDate.of(1978, 2, 19));
    assertThat(result.getMediaMovelSimples().getCodneg()).isNotNull().isEqualTo("MGLU3");
    assertThat(result.getMediaMovelSimples().getPeriodo()).isNotNull().isEqualTo(9);
    assertThat(result.getMediaMovelSimples().getPremedult()).isNotNull().isEqualTo(new BigDecimal("10.90"));
  }

  @Test
  public void buscaMediaSimplesPorCodNegPeriodoErradoDtPreg() throws Exception {
    //given
    when(sqlUtil.getSelectByCodNegPeriodoDtPreg()).thenCallRealMethod();
    when(sqlUtil.toParametersSelectByCodNegPeriodoDtPreg(any(), any(), any(), any())).thenCallRealMethod();
    when(mapper.mapper(any())).thenCallRealMethod();
    final LocalDate dtpreg = LocalDate.of(1978, 2, 16);
    this.thrown.expectMessage("Erro ao buscar média móvel simples!");
    this.thrown.expect(EmptyResultDataAccessException.class);
    //when
    target.buscaMediaSimplesPorCodNegPeriodoDtPreg("MGLU3", 8, dtpreg, dtpreg.plusDays(2));
  }

  @Test
  public void buscaMediaSimplesPorCodNegErradoPeriodoDtPreg() throws Exception {
    //given
    when(sqlUtil.getSelectByCodNegPeriodoDtPreg()).thenCallRealMethod();
    when(sqlUtil.toParametersSelectByCodNegPeriodoDtPreg(any(), any(), any(), any())).thenCallRealMethod();
    when(mapper.mapper(any())).thenCallRealMethod();
    final LocalDate dtpreg = LocalDate.of(1978, 2, 16);
    this.thrown.expectMessage("Erro ao buscar média móvel simples!");
    this.thrown.expect(EmptyResultDataAccessException.class);
    //when
    target.buscaMediaSimplesPorCodNegPeriodoDtPreg("MGLU", 9, dtpreg, dtpreg.plusDays(2));
  }

  @Test
  public void buscaMediaSimplesPorCodNegPeriodoDtPregErrado() throws Exception {
    //given
    when(sqlUtil.getSelectByCodNegPeriodoDtPreg()).thenCallRealMethod();
    when(sqlUtil.toParametersSelectByCodNegPeriodoDtPreg(any(), any(), any(), any())).thenCallRealMethod();
    when(mapper.mapper(any())).thenCallRealMethod();
    final LocalDate dtpreg = LocalDate.of(1978, 2, 7);
    this.thrown.expectMessage("Erro ao buscar média móvel simples!");
    this.thrown.expect(EmptyResultDataAccessException.class);
    //when
    target.buscaMediaSimplesPorCodNegPeriodoDtPreg("MGLU3", 9, dtpreg, dtpreg.plusDays(4));
  }

  private List<MediaMovelSimplesSemanal> mmsPeriodosList(){
    return from(MediaMovelSimplesSemanal.class)
        .gimme(2,MEDIA_MOVEL_SIMPLES_SEMANAL_VALID_001,
            MEDIA_MOVEL_SIMPLES_SEMANAL_VALID_002);
  }

}