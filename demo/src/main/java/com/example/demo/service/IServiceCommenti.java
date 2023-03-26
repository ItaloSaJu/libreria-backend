package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Commento;
import com.example.demo.entity.Libri;

public interface IServiceCommenti {

	public Iterable<Commento> findAll();
	public Optional<Commento> findById(Long id);
	public Commento save(Commento commento);
	List<Commento> listCommentoPerLibro (Libri libro);
	void deleteCommento(Long id);
}
