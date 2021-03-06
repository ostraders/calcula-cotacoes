package com.ricardococati.calculacotacoes.entities.domains.histograma;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Histograma {

  private String codneg;
  private BigDecimal prehist;

}
