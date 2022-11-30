package com.omarcs.proyect.two.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omarcs.proyect.two.clients.ProductRestClient;
import com.omarcs.proyect.two.models.Item;

@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {
	
	@Autowired
	private ProductRestClient feignClient;

	@Override
	public List<Item> findAll() {
		return feignClient.listAll().stream().map(p-> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer quantity) {
		return new Item(feignClient.detail(id), quantity);
	}

}