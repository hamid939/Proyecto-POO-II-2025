package com.practica.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.Entity.Tables;
import com.practica.Repository.ITablesRepository;
import com.practica.Service.ITablesService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class TablesServiceImpl implements ITablesService{
	
	private final ITablesRepository repository;

	@Override
	public List<Tables> findAll() {
		return repository.findAll();
	}

	@Override
	public Tables savetransactional(Tables tables) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tables save(Tables tables) {
		return repository.save(tables);
	}

	@Override
	public Tables update(Tables tables) {
		return repository.save(tables);
	}

	@Override
	public Tables findById(Integer id) {
		return repository.findById(id).orElseThrow();
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

}
