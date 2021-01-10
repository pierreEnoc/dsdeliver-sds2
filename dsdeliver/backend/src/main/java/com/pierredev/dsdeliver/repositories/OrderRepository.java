package com.pierredev.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pierredev.dsdeliver.config.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
