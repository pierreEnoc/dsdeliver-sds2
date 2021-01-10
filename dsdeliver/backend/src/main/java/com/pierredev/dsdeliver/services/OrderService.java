package com.pierredev.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pierredev.dsdeliver.config.entities.Order;
import com.pierredev.dsdeliver.config.entities.Product;
import com.pierredev.dsdeliver.dto.OrderDTO;
import com.pierredev.dsdeliver.dto.ProductDTO;
import com.pierredev.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}

}
