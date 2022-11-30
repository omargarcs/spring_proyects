package com.omarcs.proyect.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SbItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbItemApplication.class, args);
	}
}