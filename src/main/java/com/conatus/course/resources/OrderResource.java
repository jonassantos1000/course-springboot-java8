package com.conatus.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conatus.course.entities.Order;
import com.conatus.course.service.OrderService;



@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired //Faz a injeção de dependencia da classe OrderService
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}") //Chama o método e retorna a requisição do método(Retorno que é consultado no postman)
	public ResponseEntity<Order> FindById(@PathVariable Long id) {
		Order obj = service.FindById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
