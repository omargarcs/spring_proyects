package com.omarcs.proyect.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean("restTemplate")
	public RestTemplate restTemplateRegister() {
		return new RestTemplate();
	}

}
