package com.mm.itempvuv.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name = "adsDataSource")
    @Qualifier("adsDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.ads")
    public DataSource businessDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "qbiDataSource")
    @Qualifier("qbiDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.qbi")
    public DataSource dwDataSource() {
        return DataSourceBuilder.create().build();
    }
}
