package com.joaoneves.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaoneves.course.entities.Product;
import com.joaoneves.course.repositories.ProductRepository;


@Service //usado para registrar como um componente de service
public class ProductService {

	@Autowired
	private ProductRepository repository; //injeção de dependência do userrepository
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get(); //retorno do objeto que está dentro do user
	}
}
