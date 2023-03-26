package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Commento;
import com.example.demo.entity.Libri;

public interface CommentiRepo extends JpaRepository<Commento, Long> {

	List<Commento> findByLibro(Libri libri);

}
