package com.practica.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.Entity.Order;
import com.practica.Repository.IOrderRepository;
import com.practica.Service.IOrderService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements IOrderService{
	
	private final IOrderRepository repository;

	@Override
	public List<Order> findAll() {
		return repository.findAll();
	}

	@Override
	public Order savetransactional(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order save(Order order) {
		return repository.save(order);
	}

	@Override
	public Order update(Order order) {
		return repository.save(order);
	}

	@Override
	public Order findById(Integer id) {
		return repository.findById(id).orElseThrow();
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

}
