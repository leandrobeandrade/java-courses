package com.projeto.spring_project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.spring_project.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll () {
		User user = new User(1L, "Maria", "maria@gmail.com", "19992290211", "123456");
		return ResponseEntity.ok().body(user);
	}
}
