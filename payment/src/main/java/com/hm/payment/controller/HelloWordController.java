package com.hm.payment.controller;

import cn.hutool.core.util.IdUtil;
import com.hm.payment.server.PaymentServer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: haomingp
 * @Date: 2020/9/29 17:50
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloWordController {

    @Autowired
    private PaymentServer paymentServer;

    @GetMapping("/get/{name}")
    public String getHello(@PathVariable String name) {
        return "你好啊？？？"+name;
    }



    @GetMapping("/get/ok")
    public String ok()  {
        return paymentServer.paymentInfo_isOk(31);
    }

    @GetMapping("/get/timeout")
    public String timeout()  {
        return paymentServer.paymentInfo_isTmeOut(31);
    }

    @GetMapping("/get/order/{id}")
    @HystrixCommand(fallbackMethod = "paymentOrderIsError",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "1000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "6")
    })
    public String paymentOrderIsOk(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw  new RuntimeException("o(╥﹏╥)o，id不能为负数");
        }
        return "订单号流水号："+ IdUtil.simpleUUID();
    }

    public String paymentOrderIsError(@PathVariable("id") Integer id){
        return "o(╥﹏╥)o，id不能为负数"+id;
    }

}
