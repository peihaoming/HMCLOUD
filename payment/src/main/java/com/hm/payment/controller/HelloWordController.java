package com.hm.payment.controller;

import com.hm.payment.server.PaymentServer;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
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
    @HystrixCommand
    public String timeout()  {
        return paymentServer.paymentInfo_isTmeOut(31);
    }
}
