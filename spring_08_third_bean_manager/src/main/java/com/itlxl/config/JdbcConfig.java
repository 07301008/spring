package com.itlxl.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itlxl.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

//@Configuration
public class JdbcConfig {
    // 1、定义一个方法获得要管理的对象
    // 2、添加@Bean表示当前方法的返回值是一个Bean
    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
