package com.example.victor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.victor.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
