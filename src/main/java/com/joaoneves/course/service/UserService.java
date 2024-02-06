package com.joaoneves.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaoneves.course.entities.User;
import com.joaoneves.course.repositories.UserRepository;


@Service //usado para registrar como um componente de service
public class UserService {

	@Autowired
	private UserRepository repository; //injeção de dependência do userrepository
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get(); //retorno do objeto que está dentro do user
	}
}
