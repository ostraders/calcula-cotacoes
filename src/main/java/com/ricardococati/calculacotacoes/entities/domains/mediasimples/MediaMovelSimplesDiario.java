package com.ricardococati.calculacotacoes.entities.domains.mediasimples;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MediaMovelSimplesDiario {

  private Long idMediaMovelSimplesDiario;
  private LocalDate dtpreg;
  private MediaMovelSimples mediaMovelSimples;

}
