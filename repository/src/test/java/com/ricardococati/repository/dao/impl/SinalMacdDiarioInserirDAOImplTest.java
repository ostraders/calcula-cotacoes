package com.ricardococati.repository.dao.impl;

import static br.com.six2six.fixturefactory.Fixture.from;
import static com.ricardococati.repository.dao.templates.SinalMacdDiarioTemplateLoader.SINAL_MACD_DIARIO_VALID_001;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.ricardococati.model.dto.SinalMacdDiario;
import com.ricardococati.repository.dao.config.BaseJdbcTest;
import com.ricardococati.repository.dao.sqlutil.SinalMacdDiarioSQLUtil;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SinalMacdDiarioInserirDAOImplTest extends BaseJdbcTest {

  @InjectMocks
  private SinalMacdDiarioInserirDAOImpl target;
  @Mock
  private GeraSequenciaDAOImpl genericDAO;
  @Mock
  private SinalMacdDiarioSQLUtil sqlUtil;
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() throws Exception {
    FixtureFactoryLoader.loadTemplates("com.ricardococati.repository.dao.templates");
    target = new SinalMacdDiarioInserirDAOImpl(
        getNamedParameterJdbcTemplate(),
        genericDAO,
        sqlUtil
    );
  }

  @Test
  public void incluirSinalMacd() {
    //given
    when(genericDAO.getSequence(any())).thenReturn(1);
    when(sqlUtil.getInsert()).thenCallRealMethod();
    when(sqlUtil.toParameters(any())).thenCallRealMethod();
    SinalMacdDiario dto = buildSinalMacdDiario();
    //when
    Boolean retorno = target.incluirSinalMacd(dto);
    //then
    assertTrue(retorno);
  }

  @Test
  public void incluirSinalMacdDiarioNull() {
    //given
    when(genericDAO.getSequence(any())).thenReturn(1);
    when(sqlUtil.getInsert()).thenCallRealMethod();
    when(sqlUtil.toParameters(any())).thenCallRealMethod();
    SinalMacdDiario dto = null;
    this.thrown.expectMessage(
        "Violação de integridade na inserção de SINAL_MACD_DIARIO"
    );
    this.thrown.expect(DataIntegrityViolationException.class);
    //when
    Boolean retorno = target.incluirSinalMacd(dto);
  }

  @Test
  public void incluirSinalMacdDtPregNull() {
    //given
    when(genericDAO.getSequence(any())).thenReturn(1);
    when(sqlUtil.getInsert()).thenCallRealMethod();
    when(sqlUtil.toParameters(any())).thenCallRealMethod();
    SinalMacdDiario dto = buildSinalMacdDiario();
    dto.setDtpreg(null);
    this.thrown.expectMessage(
        "Violação de integridade na inserção de SINAL_MACD_DIARIO"
    );
    this.thrown.expect(DataIntegrityViolationException.class);
    //when
    Boolean retorno = target.incluirSinalMacd(dto);
  }

  @Test
  public void incluirSinalMacdNull() {
    //given
    when(genericDAO.getSequence(any())).thenReturn(1);
    when(sqlUtil.getInsert()).thenCallRealMethod();
    when(sqlUtil.toParameters(any())).thenCallRealMethod();
    SinalMacdDiario dto = buildSinalMacdDiario();
    dto.setSinalMacd(null);
    this.thrown.expectMessage(
        "Violação de integridade na inserção de SINAL_MACD_DIARIO"
    );
    this.thrown.expect(DataIntegrityViolationException.class);
    //when
    Boolean retorno = target.incluirSinalMacd(dto);
  }

  @Test
  public void incluirSinalMacdCodNegNull() {
    //given
    when(genericDAO.getSequence(any())).thenReturn(1);
    when(sqlUtil.getInsert()).thenCallRealMethod();
    when(sqlUtil.toParameters(any())).thenCallRealMethod();
    SinalMacdDiario dto = buildSinalMacdDiario();
    dto.getSinalMacd().setCodneg(null);
    this.thrown.expectMessage(
        "Violação de integridade na inserção de SINAL_MACD_DIARIO"
    );
    this.thrown.expect(DataIntegrityViolationException.class);
    //when
    Boolean retorno = target.incluirSinalMacd(dto);
  }

  private SinalMacdDiario buildSinalMacdDiario() {
    return from(SinalMacdDiario.class)
        .gimme(SINAL_MACD_DIARIO_VALID_001);
  }

}