package com.yuan.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.sun.xml.internal.fastinfoset.CommonResourceBundle;
import com.yuan.springcloud.entities.CommonResult;
import com.yuan.springcloud.entities.Payment;
import com.yuan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.sql.CommonDataSource;

/**
 * @author: yyss
 * @create: 2021-03-26 12:22
 **/
@RestController
@Slf4j
public class CircleBreakerController {

    public static final String SERVICE_URL = "http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/fallback/{id}")
    //@SentinelResource(value = "fallback")  // 没有配置
    //@SentinelResource(value = "fallback",fallback = "handlerFallback")  // 没有配置
    //@SentinelResource(value = "fallback", blockHandler = "blockHander")
    @SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHander")
    public CommonResult<Payment> fallback(@PathVariable Long id) {
        CommonResult result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id, CommonResult.class, id);
        if (id == 4) {
            throw new IllegalArgumentException("IllegalAccessExceptio, 非法参数异常....");
        } else if (result.getData() == null) {
            throw new NullPointerException("NullPointerException, 该ID没有记录，空指针异常");
        }
        return result;
    }

    // 本例是fallback
    public CommonResult handlerFallback(@PathVariable Long id, Throwable e) {
        Payment payment = new Payment(id, "null");
        return new CommonResult(444,"兜底异常handlerFallback，exception内容：" + e.getMessage(),payment);
    }

    // 本例是 blockHander
    public  CommonResult blockHander(@PathVariable Long id, BlockException blockException) {
        Payment payment = new Payment(id, null);
        return new CommonResult(445,"blockHander -- sentinel 限流，无此流水: blockException:" + blockException.getRule());
    }

    // ==========openfeign

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "consumer/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        return paymentService.paymentSQL(id);
    }

}
