package com.omarcs.proyect.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.omarcs.proyect.one.models.entity.Product;
import com.omarcs.proyect.one.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	
	@GetMapping("/listAll")
	public List<Product> listAll(){
		return productService.findAll();
	}

	@GetMapping("/listId/{id}")
	public Product detail(@PathVariable Long id){
		return productService.findById(id);
	}
}
