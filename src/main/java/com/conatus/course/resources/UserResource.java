package com.conatus.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conatus.course.entities.User;
import com.conatus.course.service.UserService;



@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired //Faz a injeção de dependencia da classe UserService
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}") //Chama o método e retorna a requisição do método(Retorno que é consultado no postman)
	public ResponseEntity<User> FindById(@PathVariable Long id) {
		User obj = service.FindById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
