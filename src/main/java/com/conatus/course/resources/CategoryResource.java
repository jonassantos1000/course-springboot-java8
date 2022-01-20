package com.conatus.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conatus.course.entities.Category;
import com.conatus.course.service.CategoryService;



@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired //Faz a injeção de dependencia da classe CategoryService
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}") //Chama o método e retorna a requisição do método(Retorno que é consultado no postman)
	public ResponseEntity<Category> FindById(@PathVariable Long id) {
		Category obj = service.FindById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
