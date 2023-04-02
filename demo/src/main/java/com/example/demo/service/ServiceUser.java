package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;

@Service
public class ServiceUser implements IserviceUser {
	
	@Autowired
	private UserRepo userRepo; 

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
