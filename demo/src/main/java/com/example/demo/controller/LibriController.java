package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.entity.Libri;
import com.example.demo.repository.LibriRepo;
import com.example.demo.service.CategoryService;
import com.example.demo.service.LibriService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class LibriController {

	@Autowired
	private LibriService userService;
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private LibriRepo UserRepo;
	
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody Libri users) {		
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(users));
	}
	
	@GetMapping("/libri")
	public List<Libri > getAll(){
		List<Libri> user = (List<Libri>) userService.findAll();
		return user;
	}
	
	@GetMapping("/libri/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		 Optional<Libri> user = userService.findById(id);
		 if(!user.isPresent()) { 
			return ResponseEntity.notFound().build();
		 } 
		 return  ResponseEntity.ok(user);
	}
	
	@GetMapping("/category/{categoriaId}")
    public List<Libri> listarExamenesDeUnaCategoria(@PathVariable Long categoriaId){
        Category categoria = new Category();
        categoria.setCategoriaId(categoriaId);
        return userService.listLibriCategoria(categoria);
    }
	
	@GetMapping("/check")
	public String submitForm(@RequestParam(name="myCheckbox", required=false) String idsCategorias,
							@RequestParam(name="nuovo", required=false) String nuovo,
							@RequestParam(name="usato", required=false) String usato ) {
		
		if(idsCategorias !=null) {
			System.out.println("myCheckbox");
		}else if(nuovo !=null) {
			System.out.println("nuovo");
		} else if (usato !=null) {
			System.out.println("usato");
			return "usato";
		}
		return "usato";
	}	
	
}	
	
