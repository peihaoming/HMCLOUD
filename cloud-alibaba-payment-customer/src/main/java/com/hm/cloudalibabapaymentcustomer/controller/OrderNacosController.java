package com.hm.cloudalibabapaymentcustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: haomingp
 * @Date: 2020/10/21 17:49
 * @Description:
 */
@RestController
public class OrderNacosController {

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/customer/payment/order")
    public String getOrder() {
        return restTemplate.getForObject(serverUrl+"/get/order",String.class);
    }
}
