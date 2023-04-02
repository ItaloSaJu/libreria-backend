package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Category;
import com.example.demo.entity.Libri;
import com.example.demo.repository.CategoryRepo;

@Transactional
@Service
public class CategoryService implements IServiceCategory{
	
	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public Iterable<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public Optional<Category> findById(Long id) {
		// TODO Auto-generated method stub
		return categoryRepo.findById(id);
	}

	@Override
	public Category save(Category category) {
		// TODO Auto-Category method stub
		return categoryRepo.save(category);
	}

	

}
