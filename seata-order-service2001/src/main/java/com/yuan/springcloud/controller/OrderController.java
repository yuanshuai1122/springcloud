package com.yuan.springcloud.controller;

import com.yuan.springcloud.domain.CommonResult;
import com.yuan.springcloud.domain.Order;
import com.yuan.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: yyss
 * @create: 2021-03-26 22:11
 **/
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}

