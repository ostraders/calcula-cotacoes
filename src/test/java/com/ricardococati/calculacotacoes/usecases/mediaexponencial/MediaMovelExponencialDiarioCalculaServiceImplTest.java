package com.ricardococati.calculacotacoes.usecases.mediaexponencial;

import static br.com.six2six.fixturefactory.Fixture.from;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_001;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_002;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_003;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_004;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_005;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_006;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_007;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_008;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_009;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_010;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_011;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_012;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_013;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_014;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_015;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_016;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_017;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_018;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_019;
import static com.ricardococati.calculacotacoes.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_VALID_020;
import static com.ricardococati.calculacotacoes.utils.geral.BigDecimalCustomizado.sendDoubleGetValueBigDecimalArredonda4Casas;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.ricardococati.calculacotacoes.adapters.repositories.mediaexponencial.MediaMovelExponencialDiarioBuscarDAO;
import com.ricardococati.calculacotacoes.adapters.repositories.mediaexponencial.MediaMovelExponencialDiarioInserirDAO;
import com.ricardococati.calculacotacoes.adapters.repositories.mediasimples.MediaMovelSimplesDiarioBuscarDAO;
import com.ricardococati.calculacotacoes.entities.domains.candlestick.CandlestickDiario;
import com.ricardococati.calculacotacoes.entities.domains.mediaexponencial.MediaMovelExponencialDiario;
import com.ricardococati.calculacotacoes.entities.domains.mediasimples.MediaMovelSimples;
import com.ricardococati.calculacotacoes.entities.domains.mediasimples.MediaMovelSimplesDiario;
import com.ricardococati.calculacotacoes.usecases.candlestick.CandlestickDiarioBuscarService;
import com.ricardococati.calculacotacoes.usecases.mediaexponencial.impl.MediaMovelExponencialDiarioCalculaServiceImpl;
import java.time.LocalDate;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MediaMovelExponencialDiarioCalculaServiceImplTest {

  @InjectMocks
  private MediaMovelExponencialDiarioCalculaServiceImpl target;
  @Mock
  private CandlestickDiarioBuscarService diarioService;
  @Mock
  private MediaMovelSimplesDiarioBuscarDAO mediaMovelSimplesDAO;
  @Mock
  private MediaMovelExponencialDiarioBuscarDAO mmeDAO;
  @Mock
  private MediaMovelExponencialDiarioInserirDAO mmeInserirDAO;

  private LocalDate dtpreg;

  @Before
  public void setUp() {
    FixtureFactoryLoader.loadTemplates("com.ricardococati.calculacotacoes.templates");
    this.dtpreg = LocalDate.of(1978, 2, 16);
  }

  @Test
  public void executeByCodNeg() throws Exception {
    //given
    List<CandlestickDiario> candlestickList = getListCandlestickDiario();
    when(diarioService.buscaCandlestickDiarioPorCodNeg(any())).thenReturn(candlestickList);
    final int periodo = 9;
    when(mediaMovelSimplesDAO.buscaMediaSimplesPorCodNegPeriodoDtPreg(any(), any(), any()))
        .thenReturn(buildMediaSimples("MGLU3", 10.1, dtpreg.plusDays(periodo-1), periodo));

    //when
    List<MediaMovelExponencialDiario> returned = target.executeByCodNeg("MGLU3");

    //then
    assertTrue(!returned.isEmpty());
    assertThat(returned).isNotNull().size().isEqualTo(29);
  }

  @Test
  public void executeByCodNegCandlestickNull() throws Exception {
    //given
    when(diarioService.buscaCandlestickDiarioPorCodNeg(any())).thenReturn(null);
    when(mediaMovelSimplesDAO.buscaMediaSimplesPorCodNegPeriodoDtPreg(any(), any(), any()))
        .thenReturn(buildMediaSimples("MGLU3", 10.1, dtpreg, 9));
    //when
    List<MediaMovelExponencialDiario> returned = target.executeByCodNeg("MGLU3");
    //then
    assertTrue(returned.isEmpty());
  }

  @Test
  public void executeByCodNegCandlestickEmpty() throws Exception {
    //given
    when(diarioService.buscaCandlestickDiarioPorCodNeg(any())).thenReturn(null);
    when(mediaMovelSimplesDAO.buscaMediaSimplesPorCodNegPeriodoDtPreg(any(), any(), any()))
        .thenReturn(buildMediaSimples("MGLU3", 10.1, dtpreg, 9));
    //when
    List<MediaMovelExponencialDiario> returned = target.executeByCodNeg("MGLU3");
    //then
    assertTrue(returned.isEmpty());
  }

  private List<CandlestickDiario> getListCandlestickDiario() {
    return from(CandlestickDiario.class)
        .gimme(20, CANDLESTICK_DIARIO_VALID_001
            , CANDLESTICK_DIARIO_VALID_002
            , CANDLESTICK_DIARIO_VALID_003
            , CANDLESTICK_DIARIO_VALID_004
            , CANDLESTICK_DIARIO_VALID_005
            , CANDLESTICK_DIARIO_VALID_006
            , CANDLESTICK_DIARIO_VALID_007
            , CANDLESTICK_DIARIO_VALID_008
            , CANDLESTICK_DIARIO_VALID_009
            , CANDLESTICK_DIARIO_VALID_010
            , CANDLESTICK_DIARIO_VALID_011
            , CANDLESTICK_DIARIO_VALID_012
            , CANDLESTICK_DIARIO_VALID_013
            , CANDLESTICK_DIARIO_VALID_014
            , CANDLESTICK_DIARIO_VALID_015
            , CANDLESTICK_DIARIO_VALID_016
            , CANDLESTICK_DIARIO_VALID_017
            , CANDLESTICK_DIARIO_VALID_018
            , CANDLESTICK_DIARIO_VALID_019
            , CANDLESTICK_DIARIO_VALID_020);
  }

  private MediaMovelSimplesDiario buildMediaSimples(
      final String codneg,
      final Double preult,
      final LocalDate dtpreg,
      final Integer periodo
  ) {
    return MediaMovelSimplesDiario
        .builder()
        .dtpreg(dtpreg)
        .mediaMovelSimples(MediaMovelSimples
            .builder()
            .premedult(sendDoubleGetValueBigDecimalArredonda4Casas(preult))
            .codneg(codneg)
            .periodo(periodo)
            .build()
        )
        .build();
  }

}