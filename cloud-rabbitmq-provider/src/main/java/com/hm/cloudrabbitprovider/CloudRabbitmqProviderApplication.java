package com.hm.cloudrabbitprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
public class CloudRabbitmqProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRabbitmqProviderApplication.class, args);
    }

}
