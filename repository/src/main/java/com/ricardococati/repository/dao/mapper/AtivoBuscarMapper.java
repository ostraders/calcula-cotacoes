package com.ricardococati.repository.dao.mapper;

import com.ricardococati.model.entities.Ativo;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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