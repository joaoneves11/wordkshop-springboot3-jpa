package com.joaoneves.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaoneves.course.entities.Category;
import com.joaoneves.course.repositories.CategoryRepository;


@Service //usado para registrar como um componente de service
public class CategoryService {

	@Autowired
	private CategoryRepository repository; //injeção de dependência do userrepository
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get(); //retorno do objeto que está dentro do user
	}
}
