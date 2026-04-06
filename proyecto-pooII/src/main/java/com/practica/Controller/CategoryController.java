package com.practica.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.Entity.Category;
import com.practica.Service.ICategoryService;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/v1/categories")
@RequiredArgsConstructor

public class CategoryController {
	
	private final ICategoryService service;
	
	 @GetMapping
	    public ResponseEntity<List<Category>> findall(){
	        List<Category> categories = service.findAll();
	        return ResponseEntity.ok(categories);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Category> findById(@PathVariable Integer id){
	        return ResponseEntity.ok(service.findById(id));
	    }

	    @PostMapping
	    public ResponseEntity<Category> save(@RequestBody Category CategoryToSave){
	        Category category = service.save(CategoryToSave);
	        return new ResponseEntity<>(category, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Category> update(@PathVariable Integer id, @RequestBody Category CategoryToSave){
	        Category category = service.update(CategoryToSave);
	        return ResponseEntity.ok(category);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> delete(@PathVariable Integer id){
	        service.delete(id);
	        return ResponseEntity.noContent().build();
	    }


}
