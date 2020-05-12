package com.example.CustomerPolicyNoInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerPolicyNoInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerPolicyNoInfoApplication.class, args);
	}

}
