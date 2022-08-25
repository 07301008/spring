package com.itlxl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.itlxl.service","com.itlxl.dao"})
public class SpringConfig {
}
