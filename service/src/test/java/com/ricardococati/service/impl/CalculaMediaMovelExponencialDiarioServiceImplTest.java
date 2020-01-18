package com.ricardococati.service.impl;

import static br.com.six2six.fixturefactory.Fixture.from;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_001;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_002;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_003;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_004;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_005;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_006;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_007;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_008;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_009;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_010;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_011;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_012;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_013;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_014;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_015;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_016;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_017;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_018;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_019;
import static com.ricardococati.service.impl.templates.CandlestickDiarioDTOTemplateLoader.CANDLESTICK_DIARIO_DTO_VALID_020;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.ricardococati.model.dto.CandlestickDTO;
import com.ricardococati.model.dto.CandlestickDiarioDTO;
import com.ricardococati.model.dto.MediaMovelExponencialDiario;
import com.ricardococati.model.dto.MediaMovelSimples;
import com.ricardococati.model.dto.MediaMovelSimplesDiario;
import com.ricardococati.repository.dao.MediaMovelExponencialDiarioDAO;
import com.ricardococati.repository.dao.MediaMovelSimplesDiarioDAO;
import com.ricardococati.service.BuscarCandlestickDiarioService;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculaMediaMovelExponencialDiarioServiceImplTest {

  @InjectMocks
  private CalculaMediaMovelExponencialDiarioServiceImpl target;
  @Mock
  private BuscarCandlestickDiarioService diarioService;
  @Mock
  private MediaMovelSimplesDiarioDAO mediaMovelSimplesDAO;
  @Mock
  private MediaMovelExponencialDiarioDAO mediaMovelExponencialDAO;

  private LocalDate dtpreg;

  @Before
  public void setUp() {
    FixtureFactoryLoader.loadTemplates("com.ricardococati.service.impl.templates");
    this.dtpreg = LocalDate.of(1978, 02, 16);
  }

  @Test
  public void executeByCodNeg() {
    //given
    List<CandlestickDiarioDTO> candlestickList = getListCandlestickDiario();
    when(diarioService.buscaCandlestickDiarioPorCodNeg(any())).thenReturn(candlestickList);
    final int periodo = 9;
    when(mediaMovelSimplesDAO.buscaMediaSimplesPorCodNegPeriodoDtPreg(any(), any(), any()))
        .thenReturn(buildMediaSimples("MGLU3", 10.1, dtpreg.plusDays(periodo-1), periodo));

    //when
    List<MediaMovelExponencialDiario> returned = target.executeByCodNeg("MGLU3");

    //then
    assertTrue(!returned.isEmpty());
    assertThat(returned).isNotNull().size().isEqualTo(29);
    assertThat(returned.get(0).getDtpreg()).isNotNull().isEqualTo(LocalDate.of(1978, 02, 24));
    assertThat(returned.get(0).getMediaMovelExponencial().getPeriodo()).isNotNull().isEqualTo(9);
    assertThat(returned.get(0).getMediaMovelExponencial().getPremedult()).isNotNull().isEqualTo(new BigDecimal("10.1000"));
    assertThat(returned.get(1).getDtpreg()).isNotNull().isEqualTo(LocalDate.of(1978, 02, 25));
    assertThat(returned.get(1).getMediaMovelExponencial().getPeriodo()).isNotNull().isEqualTo(9);
    assertThat(returned.get(1).getMediaMovelExponencial().getPremedult()).isNotNull().isEqualTo(new BigDecimal("10.4600"));
    assertThat(returned.get(2).getDtpreg()).isNotNull().isEqualTo(LocalDate.of(1978, 02, 26));
    assertThat(returned.get(2).getMediaMovelExponencial().getPeriodo()).isNotNull().isEqualTo(9);
    assertThat(returned.get(2).getMediaMovelExponencial().getPremedult()).isNotNull().isEqualTo(new BigDecimal("10.6080"));
    assertThat(returned.get(11).getDtpreg()).isNotNull().isEqualTo(LocalDate.of(1978, 03, 07));
    assertThat(returned.get(11).getMediaMovelExponencial().getPeriodo()).isNotNull().isEqualTo(9);
    assertThat(returned.get(11).getMediaMovelExponencial().getPremedult()).isNotNull().isEqualTo(new BigDecimal("11.3862"));
  }

  @Test
  public void executeByCodNegCandlestickNull() {
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
  public void executeByCodNegCandlestickEmpty() {
    //given
    when(diarioService.buscaCandlestickDiarioPorCodNeg(any())).thenReturn(null);
    when(mediaMovelSimplesDAO.buscaMediaSimplesPorCodNegPeriodoDtPreg(any(), any(), any()))
        .thenReturn(buildMediaSimples("MGLU3", 10.1, dtpreg, 9));
    //when
    List<MediaMovelExponencialDiario> returned = target.executeByCodNeg("MGLU3");
    //then
    assertTrue(returned.isEmpty());
  }

  private List<CandlestickDiarioDTO> getListCandlestickDiario() {
    return from(CandlestickDiarioDTO.class)
        .gimme(20, CANDLESTICK_DIARIO_DTO_VALID_001
            , CANDLESTICK_DIARIO_DTO_VALID_002
            , CANDLESTICK_DIARIO_DTO_VALID_003
            , CANDLESTICK_DIARIO_DTO_VALID_004
            , CANDLESTICK_DIARIO_DTO_VALID_005
            , CANDLESTICK_DIARIO_DTO_VALID_006
            , CANDLESTICK_DIARIO_DTO_VALID_007
            , CANDLESTICK_DIARIO_DTO_VALID_008
            , CANDLESTICK_DIARIO_DTO_VALID_009
            , CANDLESTICK_DIARIO_DTO_VALID_010
            , CANDLESTICK_DIARIO_DTO_VALID_011
            , CANDLESTICK_DIARIO_DTO_VALID_012
            , CANDLESTICK_DIARIO_DTO_VALID_013
            , CANDLESTICK_DIARIO_DTO_VALID_014
            , CANDLESTICK_DIARIO_DTO_VALID_015
            , CANDLESTICK_DIARIO_DTO_VALID_016
            , CANDLESTICK_DIARIO_DTO_VALID_017
            , CANDLESTICK_DIARIO_DTO_VALID_018
            , CANDLESTICK_DIARIO_DTO_VALID_019
            , CANDLESTICK_DIARIO_DTO_VALID_020);
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
        )
        .build();
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
            .premedult(new BigDecimal(preult).setScale(4, BigDecimal.ROUND_HALF_UP))
            .codneg(codneg)
            .periodo(periodo)
            .build()
        )
        .build();
  }

}