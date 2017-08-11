package com.sunlands.trade.revenuerecognition.process.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by IntelliJ IDEA.
 * User: zxf
 * Date: 2017/8/11
 * Time: 下午2:29
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class DBConfig {

    @Bean
    public DataSource basicDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("${trade.db.url}");
        dataSource.setUsername("${trade.db.username}");
        dataSource.setPassword("${trade.db.password}");
        dataSource.setInitialSize(1);
        dataSource.setMaxActive(100);
        dataSource.setMinIdle(5);
        dataSource.setMaxIdle(30);
        dataSource.setMaxWait(60000);
        dataSource.setRemoveAbandoned(true);
        dataSource.setRemoveAbandonedTimeout(180);
        dataSource.setDefaultAutoCommit(true);
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager  transactionManagerMaster () {
        return new DataSourceTransactionManager(basicDataSource());
    }




}
