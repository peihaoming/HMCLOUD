package com.hm.cloudalibabasentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSentinelApplication.class, args);
    }

}
