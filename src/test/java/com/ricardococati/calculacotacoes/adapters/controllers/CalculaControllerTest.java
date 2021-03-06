package com.ricardococati.calculacotacoes.adapters.controllers;

import static br.com.six2six.fixturefactory.Fixture.from;
import static com.ricardococati.calculacotacoes.templates.RecomendacaoDiarioTemplateLoader.RECOMENDACAO_DIARIO_VALID_001;
import static com.ricardococati.calculacotacoes.templates.RecomendacaoDiarioTemplateLoader.RECOMENDACAO_DIARIO_VALID_002;
import static com.ricardococati.calculacotacoes.templates.RecomendacaoDiarioTemplateLoader.RECOMENDACAO_DIARIO_VALID_003;
import static com.ricardococati.calculacotacoes.templates.RecomendacaoSemanalTemplateLoader.RECOMENDACAO_SEMANAL_VALID_001;
import static com.ricardococati.calculacotacoes.templates.RecomendacaoSemanalTemplateLoader.RECOMENDACAO_SEMANAL_VALID_002;
import static com.ricardococati.calculacotacoes.templates.RecomendacaoSemanalTemplateLoader.RECOMENDACAO_SEMANAL_VALID_003;
import static org.hamcrest.Matchers.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.ricardococati.calculacotacoes.adapters.controllers.calcula.CalculaController;
import com.ricardococati.calculacotacoes.entities.domains.recomendacao.RecomendacaoDiario;
import com.ricardococati.calculacotacoes.entities.domains.recomendacao.RecomendacaoSemanal;
import com.ricardococati.calculacotacoes.usecases.calculageral.CalculaGeralDiarioService;
import com.ricardococati.calculacotacoes.usecases.calculageral.CalculaGeralSemanalService;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {CalculaController.class})
@AutoConfigureMockMvc(addFilters = false)
public class CalculaControllerTest {

  @MockBean
  private CalculaGeralDiarioService geralDiarioService;
  @MockBean
  private CalculaGeralSemanalService geralSemanalService;
  @Autowired
  private MockMvc mockMvc;

  @Before
  public void setUp() {
    FixtureFactoryLoader.loadTemplates("com.ricardococati.calculacotacoes.templates");
  }

  @Test
  public void calculaCodNeg() throws Exception {
    //given
    when(geralDiarioService.executeByCodNeg(any(), any()))
        .thenReturn(recomendacaoDiarioList());
    List<String> codneg = Arrays.asList("MGLU3", "BPAN4");
    String dtPregao = "16-02-1978";
    //when
    final ResultActions result = this.mockMvc
        .perform(
            post(String.format("/api/v1/calcula/geral-diario"))
                .param("codneg", codneg.toString())
                .param("dtLimitePregao", dtPregao)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON));
    //then
    result
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[0].dtpreg", is("1978-02-16")))
        .andExpect(jsonPath("$[0].recomendacao.codneg", is("MGLU3")))
        .andExpect(jsonPath("$[0].recomendacao.precoFechamento", is(11.1100)))
        .andExpect(jsonPath("$[0].recomendacao.precoMME12p", is(11.7500)))
        .andExpect(jsonPath("$[0].recomendacao.precoMME26p", is(12.3600)))
        .andExpect(jsonPath("$[0].recomendacao.precoMacd", is(-0.6100)))
        .andExpect(jsonPath("$[0].recomendacao.precoSinalMacd", is(-0.4800)))
        .andExpect(jsonPath("$[0].recomendacao.precoHistograma", is(-0.1300)))
        .andExpect(jsonPath("$[0].recomendacao.decisao", is("VENDE")))
        .andExpect(jsonPath("$[2].dtpreg", is("1978-02-18")))
        .andExpect(jsonPath("$[2].recomendacao.codneg", is("MGLU3")))
        .andExpect(jsonPath("$[2].recomendacao.precoFechamento", is(11.0500)))
        .andExpect(jsonPath("$[2].recomendacao.precoMME12p", is(11.6400)))
        .andExpect(jsonPath("$[2].recomendacao.precoMME26p", is(12.2700)))
        .andExpect(jsonPath("$[2].recomendacao.precoMacd", is(-0.6300)))
        .andExpect(jsonPath("$[2].recomendacao.precoSinalMacd", is(-0.5100)))
        .andExpect(jsonPath("$[2].recomendacao.precoHistograma", is(-0.1200)))
        .andExpect(jsonPath("$[2].recomendacao.decisao", is("VENDE")));
  }

  @Test
  public void calculaCodNegSemanal() throws Exception {
    //given
    List<RecomendacaoSemanal> semanalList = recomendacaoSemanalList();
    when(geralSemanalService.executeByCodNeg(any(), any()))
        .thenReturn(semanalList);
    List<String> codneg = Arrays.asList("MGLU3", "BPAN4");
    String dtPregao = "16-02-1978";
    //when
    final ResultActions result = this.mockMvc
        .perform(
            post(String.format("/api/v1/calcula/geral-semanal"))
                .param("codneg", codneg.toString())
                .param("dtLimitePregao", dtPregao)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON));
    //then
    result
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[0].dtpregini", is("1978-02-16")))
        .andExpect(jsonPath("$[0].dtpregfim", is("1978-02-17")))
        .andExpect(jsonPath("$[0].recomendacao.codneg", is("MGLU3")))
        .andExpect(jsonPath("$[0].recomendacao.precoFechamento", is(11.1100)))
        .andExpect(jsonPath("$[0].recomendacao.precoMME12p", is(11.7500)))
        .andExpect(jsonPath("$[0].recomendacao.precoMME26p", is(12.3600)))
        .andExpect(jsonPath("$[0].recomendacao.precoMacd", is(-0.6100)))
        .andExpect(jsonPath("$[0].recomendacao.precoSinalMacd", is(-0.4800)))
        .andExpect(jsonPath("$[0].recomendacao.precoHistograma", is(-0.1300)))
        .andExpect(jsonPath("$[0].recomendacao.decisao", is("VENDE")))
        .andExpect(jsonPath("$[2].dtpregini", is("1978-02-20")))
        .andExpect(jsonPath("$[2].dtpregfim", is("1978-02-21")))
        .andExpect(jsonPath("$[2].recomendacao.codneg", is("MGLU3")))
        .andExpect(jsonPath("$[2].recomendacao.precoFechamento", is(11.0500)))
        .andExpect(jsonPath("$[2].recomendacao.precoMME12p", is(11.6400)))
        .andExpect(jsonPath("$[2].recomendacao.precoMME26p", is(12.2700)))
        .andExpect(jsonPath("$[2].recomendacao.precoMacd", is(-0.6300)))
        .andExpect(jsonPath("$[2].recomendacao.precoSinalMacd", is(-0.5100)))
        .andExpect(jsonPath("$[2].recomendacao.precoHistograma", is(-0.1200)))
        .andExpect(jsonPath("$[2].recomendacao.decisao", is("VENDE")));
  }

  private List<RecomendacaoDiario> recomendacaoDiarioList(){
    return from(RecomendacaoDiario.class)
        .gimme(3,
            RECOMENDACAO_DIARIO_VALID_001,
            RECOMENDACAO_DIARIO_VALID_002,
            RECOMENDACAO_DIARIO_VALID_003
        );
  }

  private List<RecomendacaoSemanal> recomendacaoSemanalList(){
    return from(RecomendacaoSemanal.class)
        .gimme(3,
            RECOMENDACAO_SEMANAL_VALID_001,
            RECOMENDACAO_SEMANAL_VALID_002,
            RECOMENDACAO_SEMANAL_VALID_003
        );
  }
}