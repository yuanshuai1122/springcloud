package com.yuan.springcloud.service;

import com.yuan.springcloud.entities.CommonResult;
import com.yuan.springcloud.entities.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: yyss
 * @create: 2021-03-26 13:22
 **/
@Component
public class PaymentFallBackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回， ------ PaymentFallBackService",new Payment(id,"errorserial"));
    }
}
