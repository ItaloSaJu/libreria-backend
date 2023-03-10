package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Category;
import com.example.demo.entity.Libri;

public interface IServiceLibri {
	public Iterable<Libri> findAll();
	public Optional<Libri> findById(Long id);
	public Libri save(Libri user);
	List<Libri> listLibriCategoria ( Category categoria);
}
