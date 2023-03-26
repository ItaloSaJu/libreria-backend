package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Commento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommento ;
	
	private String titoloCommento;
	private String descriptionCommento;
	private LocalDate DateCommento = LocalDate.now();
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Libri libro;

	public Commento() {
		super(); 
	}

	public Long getIdCommento() {
		return idCommento;
	}

	public void setIdCommento(Long idCommento) {
		this.idCommento = idCommento;
	}

	public String getTitoloCommento() {
		return titoloCommento;
	}

	public void setTitoloCommento(String titoloCommento) {
		this.titoloCommento = titoloCommento;
	}

	public String getDescriptionCommento() {
		return descriptionCommento;
	}

	public void setDescriptionCommento(String descriptionCommento) {
		this.descriptionCommento = descriptionCommento;
	}

	

	public Libri getLibro() {
		return libro;
	}

	public void setLibro(Libri libro) {
		this.libro = libro;
	}

	public LocalDate getDateCommento() {
		return DateCommento;
	}

	public void setDateCommento(LocalDate dateCommento) {
		DateCommento = dateCommento;
	}
	
	
}
