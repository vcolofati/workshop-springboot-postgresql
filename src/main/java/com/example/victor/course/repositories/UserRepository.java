package com.example.victor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.victor.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
