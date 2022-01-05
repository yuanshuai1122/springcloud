package com.yuan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yyss
 * @create: 2021-03-24 10:09
 **/
@RestController
public class NacosController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping(value = "/payment/nacos/{id}")
    public String echo(@PathVariable Integer id) {
        return "Hello Nacos Discovery " + id + " 端口号：" + serverPort;
    }
}
