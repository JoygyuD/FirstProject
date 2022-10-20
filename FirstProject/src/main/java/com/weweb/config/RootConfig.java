package com.weweb.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class RootConfig {
	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig(); // hikari 객체 생성
		
		// 임시로 해놓은 것 수정 필요
		hikariConfig.setDriverClassName("org.mariadb.jdbc.Driver");// MariaDB
		hikariConfig.setJdbcUrl("jdbc:mariadb://localhost:3306/spring");// MariaDB
		
//		hikariConfig.setDriverClassName("oracle.jdbc.OracleDriver");// oracleDB
//		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");// oracleDB
		
		hikariConfig.setUsername("spring");
		hikariConfig.setPassword("spring");
		
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		
		return (SqlSessionFactory)sqlSessionFactory.getObject();
	}
	
	@Bean
	public DataSourceTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
}
