package com.omarcs.proyect.one.repository;

import org.springframework.data.repository.CrudRepository;

import com.omarcs.proyect.one.models.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}