package com.yuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: yyss
 * @create: 2021-03-24 10:23
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9002.class,args);
    }
}
