package com.practica.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.Entity.User;
import com.practica.Repository.IUserRepository;
import com.practica.Service.IUserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements IUserService{
	
	private final IUserRepository repository;

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User savetransactional(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	public User update(User user) {
		return repository.save(user);
	}

	@Override
	public User findById(Integer id) {
		return repository.findById(id).orElseThrow();
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

}
