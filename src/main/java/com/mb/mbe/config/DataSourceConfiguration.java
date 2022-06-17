package com.mb.mbe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataSourceConfiguration {

//    //    @Value("#{systemEnvironment['JDBC_CONNECTION_STRING'] ?: systemProperties['JDBC_CONNECTION_STRING'] ?: 'jdbc:mysql://localhost:3306/berserker'}")
//    String url;
//
//    //    @Value("#{systemEnvironment['DB_USERNAME'] ?: systemProperties['DB_USERNAME'] ?: 'root'}")
//    String username;
//
//    //    @Value("#{systemEnvironment['DB_PASSWORD'] ?: systemProperties['DB_PASSWORD'] ?: ''}")
//    String password;

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        driverManagerDataSource.setUsername("hr");
        driverManagerDataSource.setPassword("hr");
        return driverManagerDataSource;
    }
//
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
