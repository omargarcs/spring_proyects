package com.omarcs.proyect.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SbProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbProductsApplication.class, args);
	}
}