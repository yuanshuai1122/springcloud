package com.yuan.springcloud;

import com.yuan.springcloud.entities.CommonResult;
import com.yuan.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author: yyss
 * @create: 2021-03-26 12:06
 **/
@RestController
public class controller {

    @Value("${server.port}")
    private String serevrPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new Payment(1L,"5fg165df31bv56df4hg651h"));
        hashMap.put(2L,new Payment(2L,"56er4g68er4g654v46fsfds"));
        hashMap.put(3L,new Payment(3L,"h65rt4h98w49j4fgdfs8465"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL (@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult result = new CommonResult(200, "from mysql, serverPort:" + serevrPort, payment);
        return result;

    }
}
