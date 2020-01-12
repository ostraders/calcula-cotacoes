package com.ricardococati.repository.dao.impl;

import com.ricardococati.repository.dao.GenericDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class GenericDAOImpl implements GenericDAO {

  @Qualifier("namedParameterJdbcTemplate")
  private final NamedParameterJdbcTemplate template;

  @Override
  public Number getSequence(String sequenceName, NamedParameterJdbcTemplate template) {
    if (sequenceName == null) {
      throw new IllegalArgumentException("The passed sequence name was null", new Throwable());
    }
    return template.query("SELECT NEXTVAL('" + sequenceName + "')" , rs -> {
      rs.next();
      Number number = (Number) rs.getObject(1);
      return number;
    });
  }

}
