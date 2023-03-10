package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Category;
import com.example.demo.entity.Libri;
import com.example.demo.repository.LibriRepo;

@Transactional
@Service
public class LibriService implements IServiceLibri {

	@Autowired
	private LibriRepo UserRepo;
	
	

	@Override
	public Iterable<Libri> findAll() {
		// TODO Auto-generated method stub
		return UserRepo.findAll();
	}

	@Override
	public Optional<Libri> findById(Long id) {
		// TODO Auto-generated method stub
		return UserRepo.findById(id);
	}

	@Override
	public Libri save(Libri user) {
		// TODO Auto-generated method stub
		return UserRepo.save(user);
	}

	@Override
	public List<Libri> listLibriCategoria(Category categoria) {
		// TODO Auto-generated method stub
		return this.UserRepo.findByCategoria(categoria);
	}

	
	
	
}
