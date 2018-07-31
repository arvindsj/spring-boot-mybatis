package com.arvind.mybatis.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {
	public static final String PRIMARY_DATASOURCE = "PrimaryDS";
	public static final String SECONDARY_DATASOURCE = "SecondaryDS";

	@Bean(name = PRIMARY_DATASOURCE, destroyMethod = "")
	@ConfigurationProperties(prefix = "datasources.primary")
	@Primary
	public DataSource dataSourceOne() {
		// Filled up with the properties specified about thanks to Spring Boot black
		// magic
		return new HikariDataSource();
	}

	@Bean(name = SECONDARY_DATASOURCE, destroyMethod = "")
	@ConfigurationProperties(prefix = "datasources.secondary")
	public DataSource dataSourceAnother() {
		// Filled up with the properties specified about thanks to Spring Boot black
		// magic
		return new HikariDataSource();
	}
}