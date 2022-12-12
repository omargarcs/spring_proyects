package com.omarcs.proyect.one.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.omarcs.proyect.one.models.entity.Product;
import com.omarcs.proyect.one.repository.ProductRepository;
import com.omarcs.proyect.one.service.IProductService;


@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return productRepository.findAll();
	}
 
	@Override
	@Transactional(readOnly = true)
	public Product findById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

}
