package com.yuan.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: yyss
 * @create: 2021-03-26 22:14
 **/
@Configuration
@MapperScan({"com.yuan.springcloud.dao"})
public class MyBatisConfig {
}

