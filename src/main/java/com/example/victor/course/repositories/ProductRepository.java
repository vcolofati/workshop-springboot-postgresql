package com.example.victor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.victor.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
