package com.omarcs.proyect.two.service;

import java.util.List;

import com.omarcs.proyect.two.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item findById(Long id, Integer quantity);
	
}
