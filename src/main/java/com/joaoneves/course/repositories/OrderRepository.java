package com.joaoneves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaoneves.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
