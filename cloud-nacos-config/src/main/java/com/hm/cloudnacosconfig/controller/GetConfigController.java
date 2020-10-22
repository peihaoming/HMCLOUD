package com.hm.cloudnacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: haomingp
 * @Date: 2020/10/21 18:57
 * @Description:
 */
@RestController
@RefreshScope
public class GetConfigController {

    @Value("${config.version}")

    private String version;

    @GetMapping("/config")
    public String get(){

        return version;
    }
}
