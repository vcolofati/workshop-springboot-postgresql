package com.example.victor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.victor.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
