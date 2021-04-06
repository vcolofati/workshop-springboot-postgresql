package com.example.victor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.victor.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
