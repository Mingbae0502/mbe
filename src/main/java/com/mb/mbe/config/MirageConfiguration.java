package com.mb.mbe.config;

import jp.sf.amateras.mirage.SqlManagerImpl;
import jp.sf.amateras.mirage.bean.BeanDescFactory;
import jp.sf.amateras.mirage.bean.FieldPropertyExtractor;
import jp.sf.amateras.mirage.dialect.OracleDialect;
import jp.sf.amateras.mirage.integration.spring.SpringConnectionProvider;
import jp.sf.amateras.mirage.naming.RailsLikeNameConverter;
import jp.sf.amateras.mirage.provider.ConnectionProvider;
import jp.xet.springframework.data.mirage.repository.config.EnableMirageRepositories;
import jp.xet.springframework.data.mirage.repository.support.MiragePersistenceExceptionTranslator;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@EnableMirageRepositories(basePackages = "com.mb.mbe.repository", sqlManagerRef = "sqlManager")
public class MirageConfiguration {

    @Autowired
    DataSourceTransactionManager transactionManager;

    @Bean
    public SqlManagerImpl sqlManager() {
        // bridge java.util.logging used by mirage
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();

        SqlManagerImpl sqlManagerImpl = new SqlManagerImpl();
        sqlManagerImpl.setConnectionProvider(connectionProvider());
        sqlManagerImpl.setDialect(new OracleDialect());
        sqlManagerImpl.setBeanDescFactory(beanDescFactory());
        sqlManagerImpl.setNameConverter(new RailsLikeNameConverter());
        return sqlManagerImpl;
    }

    @Bean
    public ConnectionProvider connectionProvider() {
        SpringConnectionProvider springConnectionProvider = new SpringConnectionProvider();
        springConnectionProvider.setTransactionManager(transactionManager);
        return springConnectionProvider;
    }

    @Bean
    public BeanDescFactory beanDescFactory() {
        BeanDescFactory beanDescFactory = new BeanDescFactory();
        beanDescFactory.setPropertyExtractor(new FieldPropertyExtractor());
        return beanDescFactory;
    }

    @Bean
    public MiragePersistenceExceptionTranslator persistenceExceptionTranslator() {
        return new MiragePersistenceExceptionTranslator();
    }
}
