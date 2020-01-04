package com.ricardococati.service;

import com.ricardococati.model.dto.ControleExecucao;
import com.ricardococati.model.dto.MacdDiario;
import com.ricardococati.model.dto.MacdSemanal;
import java.util.List;

public interface CalculaService {

  List<MacdDiario> listMacdDiarioByCodNeg(final String codneg);

  List<MacdSemanal> listMacdSemanalByCodNeg(final String codneg);

  ControleExecucao carregaControleExecucao();

  Boolean updateControleExecucaoDiario(final ControleExecucao controleExecucao);

  Boolean updateControleExecucaoSemanal(final ControleExecucao controleExecucao);
}
