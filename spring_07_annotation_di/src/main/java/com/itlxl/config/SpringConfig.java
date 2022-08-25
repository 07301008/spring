package com.itlxl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.itlxl.service","com.itlxl.dao"})
@PropertySource("jdbc.properties")
public class SpringConfig {
}
