package com.demo.shopping_cart_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShoppingCartWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartWebApplication.class, args);
	}

}
