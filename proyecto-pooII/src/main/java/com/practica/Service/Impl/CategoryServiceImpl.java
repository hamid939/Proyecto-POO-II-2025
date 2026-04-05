package com.practica.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.Entity.Category;
import com.practica.Repository.ICategoryRepository;

import com.practica.Service.ICategoryService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor

public class CategoryServiceImpl implements ICategoryService{
	
	private final ICategoryRepository repository;

	@Override
	public List<Category> findAll() {
		return repository.findAll();
	}

	@Override
	public Category savetransactional(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category save(Category category) {
		return repository.save(category);
	}

	@Override
	public Category update(Category category) {
		return repository.save(category);
	}

	@Override
	public Category findById(Integer id) {
		return repository.findById(id).orElseThrow();
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

}
