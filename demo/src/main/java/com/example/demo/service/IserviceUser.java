package com.example.demo.service;

import com.example.demo.entity.User;

public interface IserviceUser {
	
	public User save(User user);
	public Iterable<User> findAll();

}
