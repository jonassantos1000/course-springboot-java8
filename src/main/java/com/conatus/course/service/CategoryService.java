package com.conatus.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conatus.course.entities.Category;
import com.conatus.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	//Faz a injeção de dependencia da classe CategoryRepository
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category FindById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
