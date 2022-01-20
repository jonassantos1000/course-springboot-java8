package com.conatus.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conatus.course.entities.Product;
import com.conatus.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	//Faz a injeção de dependencia da classe ProductRepository
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product FindById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
