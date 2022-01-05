package com.yuan.springcloud.service;

import com.yuan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author yyss
 * @Date 2021/3/14 10:35 上午
 * @Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
