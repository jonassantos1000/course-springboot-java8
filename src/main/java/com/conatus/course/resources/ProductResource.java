package com.conatus.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conatus.course.entities.Product;
import com.conatus.course.service.ProductService;



@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired //Faz a injeção de dependencia da classe ProductService
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}") //Chama o método e retorna a requisição do método(Retorno que é consultado no postman)
	public ResponseEntity<Product> FindById(@PathVariable Long id) {
		Product obj = service.FindById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
