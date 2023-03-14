package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Libri {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLibri;
	
	@Column
	private String nomeLibro;
	
	@Column
	private String autoreLibro;
	
	@Column
	private String descriptionLibro;
	
	private int prezzoLibro;
	
	@Column
	private String imageLibro;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category categoria;
	
	public Libri() {
	}

	

	public Long getIdLibri() {
		return idLibri;
	}



	public void setIdLibri(Long idLibri) {
		this.idLibri = idLibri;
	}



	public String getNomeLibro() {
		return nomeLibro;
	}

	public void setNomeLibro(String nomeLibro) {
		this.nomeLibro = nomeLibro;
	}

	public String getAutoreLibro() {
		return autoreLibro;
	}

	public void setAutoreLibro(String autoreLibro) {
		this.autoreLibro = autoreLibro;
	}

	public String getDescriptionLibro() {
		return descriptionLibro;
	}

	public void setDescriptionLibro(String descriptionLibro) {
		this.descriptionLibro = descriptionLibro;
	}

	public int getPrezzoLibro() {
		return prezzoLibro;
	}

	public void setPrezzoLibro(int prezzoLibro) {
		this.prezzoLibro = prezzoLibro;
	}

	public String getImageLibro() {
		return imageLibro;
	}

	public void setImageLibro(String imageLibro) {
		this.imageLibro = imageLibro;
	}

	public Category getCategoria() {
		return categoria;
	}

	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}

	
	
	
	
	
	
	
}
