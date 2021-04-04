package com.example.currencyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyexchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyexchangeApplication.class, args);
	}

}
