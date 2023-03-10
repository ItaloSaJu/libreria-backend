package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Libri;
import com.example.demo.repository.LibriRepo;

@SpringBootApplication
public class DemoApplication  {
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
		
		
				
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Libri user = new Libri();
		user.setId(1L);
		user.setNome("italo");
		//user.setCognome("salas");
		
		userRepo.save(user);
	}*/

}
