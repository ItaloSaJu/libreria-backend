package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.ServiceUser;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private ServiceUser serviceUser;
	
	@PostMapping("/user")
	public ResponseEntity<?> saveUser (@RequestBody User user ){
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceUser.save(user));
	}
	
	@GetMapping("/users")
	public List<User> getAll(){
		List<User> user = (List<User>) serviceUser.findAll();
		return user;
	}

}
