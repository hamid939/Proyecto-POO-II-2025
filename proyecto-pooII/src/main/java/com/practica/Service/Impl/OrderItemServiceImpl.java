package com.practica.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.Entity.OrderItem;
import com.practica.Repository.IOrderItemRepository;
import com.practica.Service.IOrderItemService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements IOrderItemService{
	
	private final IOrderItemRepository repository;

	@Override
	public List<OrderItem> findAll() {
		return repository.findAll();
	}

	@Override
	public OrderItem savetransactional(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem save(OrderItem orderItem) {
		return repository.save(orderItem);
	}

	@Override
	public OrderItem update(OrderItem orderItem) {
		return repository.save(orderItem);
	}

	@Override
	public OrderItem findById(Integer id) {
		return repository.findById(id).orElseThrow();
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

}
