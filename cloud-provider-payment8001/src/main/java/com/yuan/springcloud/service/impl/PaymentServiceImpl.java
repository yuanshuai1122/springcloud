package com.yuan.springcloud.service.impl;

import com.yuan.springcloud.dao.PaymentDao;
import com.yuan.springcloud.entities.Payment;
import com.yuan.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author yyss
 * @Date 2021/3/14 10:37 上午
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
