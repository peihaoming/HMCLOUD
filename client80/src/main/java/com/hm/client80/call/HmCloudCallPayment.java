package com.hm.client80.call;

import com.hm.client80.call.impl.HmCloudCallPaymentFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

/**
 * @Auther: haomingp
 * @Date: 2020/9/30 10:36
 * @Description:
 */
@FeignClient(value = "HMCLOUD-PAYMENT",path = "/hello",fallback = HmCloudCallPaymentFallback.class)
@Resource
public interface HmCloudCallPayment {

    @GetMapping("/get/{name}")
    String getHello(@PathVariable String name);

    @GetMapping("/get/ok")
     String ok() ;
    @GetMapping("/get/timeout")
     String timeout();
}
