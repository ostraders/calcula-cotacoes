package com.ricardococati.service;

import com.ricardococati.model.dto.RecomendacaoDiario;
import java.time.LocalDate;
import java.util.List;

public interface ICalculaRecomendacaoDiarioService {

  List<RecomendacaoDiario> executeByCodNeg(
      final String codneg,
      final LocalDate dtLimitePregao
  );

}
