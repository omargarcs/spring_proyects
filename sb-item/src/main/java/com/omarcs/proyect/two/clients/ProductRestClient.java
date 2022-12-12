package com.omarcs.proyect.two.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.omarcs.proyect.two.models.Product;

//@FeignClient(name = "products-service", url = "localhost:53267")
@FeignClient(name = "products-service")
public interface ProductRestClient {
	
	@GetMapping("/list")
	public List<Product> listAll();
	
	@GetMapping("/{id}")
	public Product detail(@PathVariable Long id);
}