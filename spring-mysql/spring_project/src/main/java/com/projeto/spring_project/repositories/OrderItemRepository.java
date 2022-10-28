package com.projeto.spring_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.spring_project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
