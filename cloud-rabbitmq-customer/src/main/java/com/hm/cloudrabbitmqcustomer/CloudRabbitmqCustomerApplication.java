package com.hm.cloudrabbitmqcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudRabbitmqCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRabbitmqCustomerApplication.class, args);
	}

}
