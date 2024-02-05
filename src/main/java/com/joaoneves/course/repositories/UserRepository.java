package com.joaoneves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaoneves.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
