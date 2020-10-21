package com.ckg.gradleFirst.transanctionTest.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.ckg.gradleFirst.transanctionTest.config.info.JDBCinfo;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class DataConfig {
    @Resource
    private JDBCinfo jdbCinfo;
//druid 包
    @Bean
    public DataSource getDatasource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(jdbCinfo.getUrl());
        druidDataSource.setUsername(jdbCinfo.getUsername());
        druidDataSource.setPassword(jdbCinfo.getPassword());
        druidDataSource.setDriverClassName(jdbCinfo.getDriver());
        return druidDataSource;
    }

    //spring-jdbc jar包
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
   }
//    org.mybatis.spring.SqlSessionFactoryBean jar包
   @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactory(DataSource dataSource){
       SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
       sqlSessionFactoryBean.setDataSource(dataSource);
       return sqlSessionFactoryBean;


   }
    /**
     * 装配事务管理器
     */
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * JDBC事务操作配置
     */
    @Bean(name = "txTemplate")
    public TransactionTemplate transactionTemplate(DataSourceTransactionManager transactionManager) {
        return new TransactionTemplate(transactionManager);
    }



}
