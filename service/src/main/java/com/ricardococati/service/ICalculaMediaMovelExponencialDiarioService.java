package com.ricardococati.service;

import com.ricardococati.model.dto.MediaMovelExponencialDiario;
import java.util.List;

public interface ICalculaMediaMovelExponencialDiarioService {

  List<MediaMovelExponencialDiario> executeByCodNeg(String codneg);

}
