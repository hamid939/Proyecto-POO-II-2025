package com.practica;

import java.time.LocalDate;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practica.Entity.Category;
import com.practica.Repository.ICategoryRepository;

import lombok.RequiredArgsConstructor;


@SpringBootApplication
@RequiredArgsConstructor
public class Application implements CommandLineRunner {
	private final ICategoryRepository categoryRespository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	categoryRespository.save(
            Category.builder()
            .name("Bebidas")
            .build()
    );
	
	categoryRespository.save(
            Category.builder()
            .name("Entradas")
            .build()
    );
}
}
