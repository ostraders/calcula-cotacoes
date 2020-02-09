package com.ricardococati.repository.dao.impl;

import static br.com.six2six.fixturefactory.Fixture.from;
import static com.ricardococati.repository.dao.templates.MediaMovelExponencial12PeriodosSemanalTemplateLoader.MEDIA_MOVEL_EXPONENCIAL_SEMANAL_12PERIODOS_VALID_001;
import static com.ricardococati.repository.dao.templates.MediaMovelExponencial26PeriodosSemanalTemplateLoader.MEDIA_MOVEL_EXPONENCIAL_SEMANAL_26PERIODOS_VALID_001;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.ricardococati.model.dto.MediaMovelExponencialSemanal;
import com.ricardococati.repository.dao.config.BaseJdbcTest;
import com.ricardococati.repository.dao.mapper.MediaMovelExponencialSemanalMapper;
import com.ricardococati.repository.dao.sqlutil.MediaMovelExponencialSemanalSQLUtil;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MediaMovelExponencialSemanalBuscarDAOImplTest extends BaseJdbcTest {

  @InjectMocks
  private MediaMovelExponencialSemanalBuscarDAOImpl target;
  @Mock
  private MediaMovelExponencialSemanalSQLUtil sqlUtil;
  @Mock
  private MediaMovelExponencialSemanalMapper mapper;
  @Mock
  private GeraSequenciaDAOImpl genericDAO;

  @Before
  public void setUp() throws Exception {
    FixtureFactoryLoader.loadTemplates("com.ricardococati.repository.dao.templates");
    target = new MediaMovelExponencialSemanalBuscarDAOImpl(
        getNamedParameterJdbcTemplate(),
        sqlUtil,
        mapper
    );
    incluirMMEAntesDeExecutarTestes();
  }

  private void incluirMMEAntesDeExecutarTestes() {
    MediaMovelExponencialSemanalInserirDAOImpl incluirDAO =
        new MediaMovelExponencialSemanalInserirDAOImpl(
            getNamedParameterJdbcTemplate(),
            genericDAO,
            sqlUtil
        );
    when(sqlUtil.getInsert()).thenCallRealMethod();
    when(sqlUtil.toParameters(any())).thenCallRealMethod();
    when(genericDAO.getSequence(any())).thenReturn(1);
    mediaMovelExponencialSemanalPeriodosList()
        .stream()
        .filter(Objects::nonNull)
        .forEach(mediaMovelExponencialSemanal -> {
          incluirDAO.incluirMediaMovelExponencial(mediaMovelExponencialSemanal);
        });
  }

  @Test
  public void getListMMEByCodNegEPeriodo() {
    //given
    when(sqlUtil.getSelectByCodNegEPeriodo()).thenCallRealMethod();
    when(sqlUtil.toParametersByCodNegEPeriodo(any(), any())).thenCallRealMethod();
    when(mapper.mapperSemanal(any())).thenCallRealMethod();
    //when
    List<MediaMovelExponencialSemanal> result =
        target.getListMMEByCodNegEPeriodo("MGLU3", 12);
    //then
    assertTrue(!result.isEmpty());
    assertThat(result).isNotNull().size().isEqualTo(1);
    assertThat(result.get(0).getDtpregini()).isNotNull().isEqualTo(LocalDate.of(1978, 2, 16));
    assertThat(result.get(0).getMediaMovelExponencial().getCodneg()).isNotNull().isEqualTo("MGLU3");
    assertThat(result.get(0).getMediaMovelExponencial().getPremedult()).isNotNull().isEqualTo(new BigDecimal("13.11"));
  }

  @Test
  public void getListMMEByCodNegNullEPeriodo() {
    //given
    when(sqlUtil.getSelectByCodNegEPeriodo()).thenCallRealMethod();
    when(sqlUtil.toParametersByCodNegEPeriodo(any(), any())).thenCallRealMethod();
    when(mapper.mapperSemanal(any())).thenCallRealMethod();
    //when
    List<MediaMovelExponencialSemanal> result =
        target.getListMMEByCodNegEPeriodo(null, 12);
    //then
    assertTrue(result.isEmpty());
  }

  @Test
  public void getListMMEByCodNegEPeriodoNull() {
    //given
    when(sqlUtil.getSelectByCodNegEPeriodo()).thenCallRealMethod();
    when(sqlUtil.toParametersByCodNegEPeriodo(any(), any())).thenCallRealMethod();
    when(mapper.mapperSemanal(any())).thenCallRealMethod();
    //when
    List<MediaMovelExponencialSemanal> result =
        target.getListMMEByCodNegEPeriodo("MGLU3", null);
    //then
    assertTrue(result.isEmpty());
  }

  @Test
  public void getListMMEByCodNegEPeriodoErrado() {
    //given
    when(sqlUtil.getSelectByCodNegEPeriodo()).thenCallRealMethod();
    when(sqlUtil.toParametersByCodNegEPeriodo(any(), any())).thenCallRealMethod();
    when(mapper.mapperSemanal(any())).thenCallRealMethod();
    //when
    List<MediaMovelExponencialSemanal> result =
        target.getListMMEByCodNegEPeriodo("MGLU3", 27);
    //then
    assertTrue(result.isEmpty());
  }

  private List<MediaMovelExponencialSemanal> mediaMovelExponencialSemanalPeriodosList(){
    return from(MediaMovelExponencialSemanal.class)
        .gimme(2,MEDIA_MOVEL_EXPONENCIAL_SEMANAL_12PERIODOS_VALID_001,
            MEDIA_MOVEL_EXPONENCIAL_SEMANAL_26PERIODOS_VALID_001);
  }

}