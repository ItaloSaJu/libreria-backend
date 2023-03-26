package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Commento;
import com.example.demo.entity.Libri;
import com.example.demo.repository.CommentiRepo;

@Transactional
@Service
public class CommentiService implements IServiceCommenti {
	
	@Autowired
	public CommentiRepo commentiRepo;

	@Override
	public Iterable<Commento> findAll() {
		return commentiRepo.findAll();
	}

	@Override
	public Optional<Commento> findById(Long id) {
		return commentiRepo.findById(id);
	}

	@Override
	public Commento save(Commento commento) {
		return commentiRepo.save(commento);
	}

	@Override
	public List<Commento> listCommentoPerLibro(Libri libro) {
		return commentiRepo.findByLibro(libro);
	}

	@Override
	public void deleteCommento(Long id) {
		 Commento commento = new Commento();
		 commento.setIdCommento(id);
		 commentiRepo.delete(commento);
	}


}
