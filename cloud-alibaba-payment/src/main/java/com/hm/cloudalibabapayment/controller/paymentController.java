package com.hm.cloudalibabapayment.controller;

import cn.hutool.core.util.IdUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: haomingp
 * @Date: 2020/10/21 17:34
 * @Description:
 */
@RestController
public class paymentController {


    @Value("${server.port}")
    private String port;

    @GetMapping("/get/order")
    public String getOrder() {
        return "订单号："+IdUtil.simpleUUID()+"  端口号："+port;
    }
}
