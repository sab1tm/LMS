package kz.sab1tm.lms.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class FlywayConfig {

    @Value("${app.schema-name}")
    private String schemaName;

    @Bean(initMethod = "migrate")
    public Flyway flyway(DataSource dataSource) {

        return Flyway.configure()
                .dataSource(dataSource)
                .schemas(schemaName)
                .validateOnMigrate(false)
                .baselineOnMigrate(true)
                .load();
    }
}
