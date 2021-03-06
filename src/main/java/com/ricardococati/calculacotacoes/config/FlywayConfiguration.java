package com.ricardococati.calculacotacoes.config;

import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FlywayConfiguration extends FlywayAutoConfiguration {

  private final DataSource dataSource;

  @Bean(initMethod = "migrate")
  public Flyway flywayInitializer() {
    Flyway flyway = new Flyway();
    flyway.setDataSource(dataSource);
    flyway.setLocations("/db/migration");
    flyway.setSchemas("public");
    flyway.setBaselineOnMigrate(false);
    flyway.setSqlMigrationPrefix("V");
    flyway.migrate();
    return flyway;
  }
}
