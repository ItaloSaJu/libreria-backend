package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Category;
import com.example.demo.entity.Libri;

public interface IServiceCategory {
	public Iterable<Category> findAll();
	public Optional<Category> findById(Long id);
	public Category save(Category category);
}
