package com.nexse.swat.springdataexample.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactoryBean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate3.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author germano giudici
 *         Date: 08/10/12
 *         Time: 12:06
 */
@Configuration
@ImportResource("classpath:/com/nexse/swat/springdataexample/conf/repository-context.xml")
public class AppConfig {


    @Bean(name="entityManagerFactory")
    public EntityManagerFactory entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource());
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setShowSql(true);
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setDatabase(Database.H2);
        factoryBean.setPersistenceUnitName("jpa.sample");
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.afterPropertiesSet();
        return factoryBean.getObject();
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory());
        return transactionManager;
    }

    @Bean(name = "dataSource")
    public DataSource dataSource(){
        EmbeddedDatabaseFactoryBean embeddedDatabaseFactoryBean = new EmbeddedDatabaseFactoryBean();
        embeddedDatabaseFactoryBean.setDatabaseType(EmbeddedDatabaseType.H2);
        embeddedDatabaseFactoryBean.afterPropertiesSet();
        return embeddedDatabaseFactoryBean.getObject();
    }

    @Bean
    public PersistenceExceptionTranslator persistenceExceptionTranslator(){
        return new HibernateExceptionTranslator();
    }
}
