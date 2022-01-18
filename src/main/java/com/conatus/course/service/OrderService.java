package com.conatus.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conatus.course.entities.Order;
import com.conatus.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	//Faz a injeção de dependencia da classe OrderRepository
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order FindById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
