package com.hm.client80.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: haomingp
 * @Date: 2020/10/10 16:03
 * @Description:
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){

        return Logger.Level.FULL;
    }
}
