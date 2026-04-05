package com.practica.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.Entity.Product;
import com.practica.Repository.IProductRepository;
import com.practica.Service.IProductService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService{
	
	private final IProductRepository repository;
	

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Override
	public Product savetransactional(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save(Product product) {
		return repository.save(product);
	}

	@Override
	public Product update(Product product) {
		return repository.save(product);
	}

	@Override
	public Product findById(Integer id) {
		return repository.findById(id).orElseThrow();
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

}
