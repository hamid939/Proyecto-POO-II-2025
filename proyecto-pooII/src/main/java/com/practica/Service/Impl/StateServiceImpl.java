package com.practica.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.Entity.State;
import com.practica.Repository.IStateRepository;
import com.practica.Service.IStateService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class StateServiceImpl implements IStateService{
	
	private final IStateRepository repository;

	@Override
	public List<State> findAll() {
		return repository.findAll();
	}

	@Override
	public State savetransactional(State state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State save(State state) {
		return repository.save(state);
	}

	@Override
	public State update(State state) {
		return repository.save(state);
	}

	@Override
	public State findById(Integer id) {
		return repository.findById(id).orElseThrow();
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

}
