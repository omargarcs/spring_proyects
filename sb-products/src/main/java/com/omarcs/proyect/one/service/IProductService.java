package com.omarcs.proyect.one.service;

import java.util.List;

import com.omarcs.proyect.one.models.entity.Product;

public interface IProductService {
	
	public List<Product> findAll();
	public Product findById(Long id);

}