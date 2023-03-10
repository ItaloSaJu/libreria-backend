package com.example.demo.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoriaId;
	
	private String nome;
	
	@OneToMany(mappedBy = "categoria",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Libri> libri = new LinkedHashSet<>();

	public Category() {
		super();
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Libri> getLibri() {
		return libri;
	}

	public void setLibri(Set<Libri> libri) {
		this.libri = libri;
	}

	

	
	
	
}
