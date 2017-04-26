//package com.example.repl.config;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
//
//
//@Configuration
//public class WithRoutingDataSourceConfig {
//    @Bean
//    public DataSource routingDataSource(@Qualifier("dataSource_write") DataSource writeDataSource, @Qualifier("dataSource_read") DataSource readDataSource) {
//        ReplicationRoutingDataSource routingDataSource = new ReplicationRoutingDataSource();
//                
//        Map<Object, Object> dataSourceMap = new HashMap<Object, Object>();
//        dataSourceMap.put("write", writeDataSource);
//        dataSourceMap.put("read", readDataSource);
//        routingDataSource.setTargetDataSources(dataSourceMap);
//        routingDataSource.setDefaultTargetDataSource(writeDataSource);
//        
//        return routingDataSource;
//    }
//    
//    @Primary
//    @Bean
//    public DataSource dataSource(@Qualifier("routingDataSource") DataSource routingDataSource) {    	
//        return new LazyConnectionDataSourceProxy(routingDataSource);
//    }   
//}
