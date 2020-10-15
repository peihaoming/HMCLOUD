package com.hm.cloudgatewaygateway9092;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayGateway9092Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayGateway9092Application.class, args);
    }

}
