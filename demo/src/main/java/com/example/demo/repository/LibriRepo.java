package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.Libri;

import jakarta.persistence.Id;

@Repository
public interface LibriRepo extends JpaRepository<Libri, Long> {
	
	List<Libri> findByCategoria(Category categoria);
	
}
