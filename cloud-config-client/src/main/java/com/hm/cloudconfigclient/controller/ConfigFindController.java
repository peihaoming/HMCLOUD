package com.hm.cloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: haomingp
 * @Date: 2020/10/15 19:18
 * @Description:
 */
@RestController
@RefreshScope
public class ConfigFindController {

    @Value("${config.version}")
    private String configInfo;

    @GetMapping("config")
    public String getConfigInfo(){
        return configInfo;
    }
}