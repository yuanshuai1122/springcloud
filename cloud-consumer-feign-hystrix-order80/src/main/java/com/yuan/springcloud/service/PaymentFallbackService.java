package com.yuan.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: yyss
 * @create: 2021-03-20 15:53
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---------PaymentHystrixService-paymentInfo_OK fall back o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---------PaymentHystrixService-paymentInfo_OK fall back o(╥﹏╥)o";
    }
}
