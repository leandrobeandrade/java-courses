package com.projeto.spring_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.spring_project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
