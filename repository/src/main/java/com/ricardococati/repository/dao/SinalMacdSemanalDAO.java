package com.ricardococati.repository.dao;

import com.ricardococati.model.dto.SinalMacdSemanal;
import java.util.List;

public interface SinalMacdSemanalDAO {

  Boolean incluirSinalMacd(final List<SinalMacdSemanal> macdList);

  List<SinalMacdSemanal> listSinalMacdByCodNeg(final String codneg);

}
