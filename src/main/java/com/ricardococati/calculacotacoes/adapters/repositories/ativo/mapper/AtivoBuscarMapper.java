package com.ricardococati.calculacotacoes.adapters.repositories.ativo.mapper;

import com.ricardococati.calculacotacoes.entities.domains.ativo.Ativo;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Component;

@Component
public class AtivoBuscarMapper {

  public Ativo mapper(ResultSet rs) {
    try {
      return Ativo
          .builder()
          .idAtivo(rs.getLong("id_ativo"))
          .ativo(rs.getString("ativo"))
          .build();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

}
