package com.yuan.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author: yyss
 * @create: 2021-03-25 10:26
 **/
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "-------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName()+"\t"+".......testB");
        return "-------testB";
    }

    @GetMapping("/testD")
    public String testD() {
//        // 暂停几秒钟线程
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("testD 测试RT");
        log.info("testD 异常比例");
        int age = 10/0;
        return "---------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testD 测试异常数");
        int age = 10/0;
        return "---------testD 测试异常数";
    }

    @GetMapping("/testHoyKey")
    @SentinelResource(value = "testHoyKey", blockHandler = "deal_testHoyKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        return "--------testHotKey";
    }
    // deal_testHoyKey 兜底方法
    public String deal_testHoyKey (String p1, String p2, BlockException e) {
        return "-------deal_testHoyKey   o(╥﹏╥)o";
    }
}
