package com.conatus.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conatus.course.entities.User;
import com.conatus.course.repositories.UserRepository;

@Service
public class UserService {
	
	//Faz a injeção de dependencia da classe UserRepository
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User FindById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert (User obj) {
		return repository.save(obj);
	}
}
