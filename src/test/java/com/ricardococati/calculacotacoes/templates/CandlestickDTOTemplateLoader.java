package com.ricardococati.calculacotacoes.templates;

import static com.ricardococati.calculacotacoes.utils.geral.BigDecimalCustomizado.sendDoubleGetValueBigDecimalArredonda4Casas;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.ricardococati.calculacotacoes.entities.domains.candlestick.Candlestick;

public class CandlestickDTOTemplateLoader implements TemplateLoader {

  public static final String CANDLESTICK_VALID_001 = "CANDLESTICK_VALID_001";
  public static final String CANDLESTICK_VALID_002 = "CANDLESTICK_VALID_002";
  public static final String CANDLESTICK_VALID_003 = "CANDLESTICK_VALID_003";
  public static final String CANDLESTICK_VALID_004 = "CANDLESTICK_VALID_004";
  public static final String CANDLESTICK_VALID_005 = "CANDLESTICK_VALID_005";
  public static final String CANDLESTICK_VALID_006 = "CANDLESTICK_VALID_006";
  public static final String CANDLESTICK_VALID_007 = "CANDLESTICK_VALID_007";
  public static final String CANDLESTICK_VALID_008 = "CANDLESTICK_VALID_008";
  public static final String CANDLESTICK_VALID_009 = "CANDLESTICK_VALID_009";
  public static final String CANDLESTICK_VALID_010 = "CANDLESTICK_VALID_010";
  public static final String CANDLESTICK_VALID_011 = "CANDLESTICK_VALID_011";
  public static final String CANDLESTICK_VALID_012 = "CANDLESTICK_VALID_012";
  public static final String CANDLESTICK_VALID_013 = "CANDLESTICK_VALID_013";
  public static final String CANDLESTICK_VALID_014 = "CANDLESTICK_VALID_014";
  public static final String CANDLESTICK_VALID_015 = "CANDLESTICK_VALID_015";
  public static final String CANDLESTICK_VALID_016 = "CANDLESTICK_VALID_016";
  public static final String CANDLESTICK_VALID_017 = "CANDLESTICK_VALID_017";
  public static final String CANDLESTICK_VALID_018 = "CANDLESTICK_VALID_018";
  public static final String CANDLESTICK_VALID_019 = "CANDLESTICK_VALID_019";
  public static final String CANDLESTICK_VALID_020 = "CANDLESTICK_VALID_020";

  @Override
  public void load() {
    Fixture.of(Candlestick.class)
        .addTemplate(CANDLESTICK_VALID_001, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(9.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(12.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(9.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.1));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(100000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_002, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(2.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(13.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(9.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.1));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(100000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_003, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(3.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(14.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(8.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.2));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(200000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_004, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(4.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(15.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(4.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.3));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(300000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_005, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(6.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(16.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(5.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.4));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(400000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_006, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(8.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(17.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(6.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.5));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(500000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_007, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(9.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(18.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(7.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.6));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(600000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_008, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(11.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(19.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(8.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.7));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(700000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_009, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(12.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(12.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(9.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.8));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(800000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_010, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(11.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(13.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(2.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.9));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(900000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_011, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(10.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(14.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(3.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.2));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(200000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_012, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(11.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(15.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(5.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.3));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(300000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_013, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(6.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(16.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(6.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.4));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(400000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_014, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(11.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(17.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(8.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.5));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(500000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_015, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(6.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(17.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(2.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.6));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(600000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_016, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(10.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(18.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(3.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.7));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(700000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_017, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(10.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(19.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(4.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.8));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(800000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_018, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(11.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(19.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(5.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.9));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(900000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_019, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(12.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(14.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(6.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.2));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(200000.0));
          add("semana", 1);
        }})
        .addTemplate(CANDLESTICK_VALID_020, new Rule() {{
          add("codneg", "MGLU3");
          add("preabe", sendDoubleGetValueBigDecimalArredonda4Casas(13.1));
          add("premax", sendDoubleGetValueBigDecimalArredonda4Casas(15.1));
          add("premin", sendDoubleGetValueBigDecimalArredonda4Casas(7.0));
          add("preult", sendDoubleGetValueBigDecimalArredonda4Casas(11.3));
          add("voltot", sendDoubleGetValueBigDecimalArredonda4Casas(400000.0));
          add("semana", 1);
        }})
    ;
  }
}