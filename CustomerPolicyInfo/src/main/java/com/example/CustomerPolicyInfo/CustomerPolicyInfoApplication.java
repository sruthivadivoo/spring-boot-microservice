package com.example.CustomerPolicyInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerPolicyInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerPolicyInfoApplication.class, args);
	}

}
