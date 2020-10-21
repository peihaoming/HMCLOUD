package com.hm.cloudalibabapaymentcustomer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: haomingp
 * @Date: 2020/10/21 17:48
 * @Description:
 */
@Configuration
public class ApplicationConfig {

    @Bean
    @LoadBalanced
    public RestTemplate add(){
        return new RestTemplate();
    }
}
