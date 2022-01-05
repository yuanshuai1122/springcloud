package com.yuan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yyss
 * @create: 2021-03-23 13:10
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String severPort;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "severPort:" + severPort + "  configInfo:" + configInfo;
    }
}
