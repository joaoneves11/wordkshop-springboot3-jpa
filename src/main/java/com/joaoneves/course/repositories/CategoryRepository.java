package com.joaoneves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaoneves.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
