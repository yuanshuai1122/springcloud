package com.yuan.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yuan.springcloud.entities.CommonResult;

/**
 * @author: yyss
 * @create: 2021-03-26 11:34
 **/
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException e) {
        return new CommonResult(4444,"按客户自定义的，global customerBlockHandler-----1");
    }

    public static CommonResult handlerException2(BlockException e) {
        return new CommonResult(4444,"按客户自定义的，global customerBlockHandler-----2");
    }
}
