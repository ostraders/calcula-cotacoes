package com.ricardococati.repository.dao.impl;

import static br.com.six2six.fixturefactory.Fixture.from;
import static com.ricardococati.repository.dao.templates.SinalMacdSemanalTemplateLoader.SINAL_MACD_SEMANAL_VALID_001;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.ricardococati.model.dto.SinalMacdSemanal;
import com.ricardococati.repository.dao.config.BaseJdbcTest;
import com.ricardococati.repository.dao.mapper.SinalMacdSemanalMapper;
import com.ricardococati.repository.dao.sqlutil.SinalMacdSemanalSQLUtil;
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
public class SinalMacdSemanalBuscarDAOImplTest extends BaseJdbcTest {

  @InjectMocks
  private SinalMacdSemanalBuscarDAOImpl target;
  @Mock
  private SinalMacdSemanalSQLUtil sqlUtil;
  @Mock
  private SinalMacdSemanalMapper mapper;
  @Mock
  private GeraSequenciaDAOImpl genericDAO;
  @Mock
  private SinalMacdSemanalSQLUtil incluirSinalMacd;

  @Before
  public void setUp() throws Exception {
    FixtureFactoryLoader.loadTemplates("com.ricardococati.repository.dao.templates");
    target = new SinalMacdSemanalBuscarDAOImpl(
        getNamedParameterJdbcTemplate(),
        sqlUtil,
        mapper
    );
    incluiSinalMacdAntesDeExecutarTestes();
  }

  @Test
  public void listSinalMacdByCodNeg() {
    //given
    when(sqlUtil.getSelectByCodNeg()).thenCallRealMethod();
    when(sqlUtil.toParametersByCodNeg(any())).thenCallRealMethod();
    when(mapper.mapper(any())).thenCallRealMethod();
    //when
    List<SinalMacdSemanal> result =
        target.listSinalMacdByCodNeg("MGLU3");
    //then
    assertTrue(!result.isEmpty());
    assertThat(result).isNotNull().size().isEqualTo(1);
    assertThat(result.get(0).getDtpregini()).isNotNull().isEqualTo(LocalDate.of(1978, 2, 16));
    assertThat(result.get(0).getSinalMacd().getCodneg()).isNotNull().isEqualTo("MGLU3");
    assertThat(result.get(0).getSinalMacd().getPresinal()).isNotNull().isEqualTo(new BigDecimal("12.11"));
  }

  @Test
  public void getListMMEByNull() {
    //given
    when(sqlUtil.getSelectByCodNeg()).thenCallRealMethod();
    when(sqlUtil.toParametersByCodNeg(any())).thenCallRealMethod();
    when(mapper.mapper(any())).thenCallRealMethod();
    //when
    List<SinalMacdSemanal> result =
        target.listSinalMacdByCodNeg(null);
    //then
    assertTrue(result.isEmpty());
  }

  @Test
  public void getListMMEByCodNegEmpty() {
    //given
    when(sqlUtil.getSelectByCodNeg()).thenCallRealMethod();
    when(sqlUtil.toParametersByCodNeg(any())).thenCallRealMethod();
    when(mapper.mapper(any())).thenCallRealMethod();
    //when
    List<SinalMacdSemanal> result =
        target.listSinalMacdByCodNeg("");
    //then
    assertTrue(result.isEmpty());
  }

  private void incluiSinalMacdAntesDeExecutarTestes() {
    SinalMacdSemanalInserirDAOImpl incluirDAO = new SinalMacdSemanalInserirDAOImpl(
        getNamedParameterJdbcTemplate(), genericDAO, incluirSinalMacd);
    when(incluirSinalMacd.getInsert()).thenCallRealMethod();
    when(incluirSinalMacd.toParameters(any())).thenCallRealMethod();
    when(genericDAO.getSequence(any())).thenReturn(1);
    sinalMacdSemanalList()
        .stream()
        .filter(Objects::nonNull)
        .forEach(incluirDAO::incluirSinalMacd);
  }

  private List<SinalMacdSemanal> sinalMacdSemanalList(){
    return from(SinalMacdSemanal.class)
        .gimme(1, SINAL_MACD_SEMANAL_VALID_001);
  }

}