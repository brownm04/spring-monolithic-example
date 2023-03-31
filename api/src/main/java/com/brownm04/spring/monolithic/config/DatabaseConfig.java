//package com.brownm04.spring.monolithic.config;
//
//import javax.sql.DataSource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement
//public class DatabaseConfig {
//
//	@Bean
//	public DataSource dataSource() {
//		return DataSourceBuilder.create()
//				.driverClassName("org.hsqldb.jdbc.JDBCDriver")
//				.url("jdbc:hsqldb:hsql://localhost/spring-monolithic-example-api")
//				.username("sa")
//				.password("")
//				.build();
//	}
//}
