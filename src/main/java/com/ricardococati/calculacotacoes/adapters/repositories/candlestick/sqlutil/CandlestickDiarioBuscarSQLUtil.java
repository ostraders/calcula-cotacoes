package com.ricardococati.calculacotacoes.adapters.repositories.candlestick.sqlutil;

import com.ricardococati.calculacotacoes.utils.sql.SQLAppender;
import java.time.LocalDate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class CandlestickDiarioBuscarSQLUtil {

  public String getSelectCodNegByDtPreg() {
    final SQLAppender sql = new SQLAppender(100);
    sql.appendSQL(" select ");
    sql.appendSQL("   codneg  ");
    sql.appendSQL(" from candlestick_diario ");
    sql.appendSQL(" where dtpreg > :dtpreg ");
    sql.appendSQL(" group by codneg ");
    sql.appendSQL(" order by codneg asc ");
    return sql.getAppendSQLSemQuebra().toString();
  }

  public MapSqlParameterSource toParametersDtPreg(final LocalDate dtpreg) {
    return new MapSqlParameterSource()
        .addValue("dtpreg", dtpreg);
  }

  public String getSelectByCodNeg() {
    SQLAppender sql = new SQLAppender(100);
    sql.appendSQL(" select ");
    sql.appendSQL("		id_candle_diario, ");
    sql.appendSQL("		codneg, ");
    sql.appendSQL("		dtpreg, ");
    sql.appendSQL("		preabe, ");
    sql.appendSQL("		premax, ");
    sql.appendSQL("		premin, ");
    sql.appendSQL("		preult, ");
    sql.appendSQL("		semana, ");
    sql.appendSQL("		voltot ");
    sql.appendSQL(" from candlestick_diario ");
    sql.appendSQL("	where codneg = :codneg ");
    sql.appendSQL("	order by dtpreg asc ");
    return sql.getAppendSQLSemQuebra().toString();
  }

  public MapSqlParameterSource toParametersCodNeg(final String codneg) {
    return new MapSqlParameterSource()
        .addValue("codneg", codneg);
  }

}