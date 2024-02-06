package com.joaoneves.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaoneves.course.entities.Order;
import com.joaoneves.course.repositories.OrderRepository;


@Service //usado para registrar como um componente de service
public class OrderService {

	@Autowired
	private OrderRepository repository; //injeção de dependência do userrepository
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get(); //retorno do objeto que está dentro do user
	}
}
