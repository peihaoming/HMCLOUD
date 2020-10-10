package com.hm.client80.controller;

import com.hm.client80.call.HmCloudCallPayment;
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

    private final HmCloudCallPayment HmCloudCallPayment;

    @Autowired
    public HelloWordController(HmCloudCallPayment HmCloudCallPayment) {
        this.HmCloudCallPayment = HmCloudCallPayment;
    }

    @GetMapping("/get/{name}")
    public String getHello(@PathVariable String name) {
      return HmCloudCallPayment.getHello(name);
    }


    @GetMapping("/get/ok")
    public String ok()  {
        return HmCloudCallPayment.ok();
    }
    @GetMapping("/get/timeout")
    public String timeout()  {
        return HmCloudCallPayment.timeout();
    }
}
