package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Commento;
import com.example.demo.entity.Libri;
import com.example.demo.service.CommentiService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class CommentiController {

	@Autowired
	private CommentiService commentiService;
	
	@PostMapping("/commento")
	private ResponseEntity<?> saveCommenti (@RequestBody Commento commento ){
		return ResponseEntity.status(HttpStatus.CREATED).body(commentiService.save(commento));
	}
	
	@GetMapping("/commento")
	private List<Commento> getAll(){
		List<Commento> commenti = (List<Commento>) commentiService.findAll();
		return commenti;
	}
	
	@GetMapping("/commento/{id}")
	private ResponseEntity<?> findById(@PathVariable Long id){
		Optional<Commento> commento = commentiService.findById(id);
		if(!commento.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(commento);
	}
	
	@GetMapping("/libro/{libroId}")
	private List<Commento> listCommentiDiUnLibro(@PathVariable Long libroId){
		Libri libro = new Libri();
		libro.setIdLibri(libroId);
		return commentiService.listCommentoPerLibro(libro);
	}
	
	@DeleteMapping("/commento/{id}")
	public ResponseEntity<?> deleteCommento(@PathVariable Long id){
		commentiService.deleteCommento(id);
		return ResponseEntity.noContent().build();
	}
}
