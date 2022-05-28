package com.saurabh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieDescriptionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDescriptionServiceApplication.class, args);
	}

}
