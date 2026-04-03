package com.practica.Service;

import java.util.List;

import com.practica.Entity.Order;

public interface IOrderService {
	
	public List<Order> findAll();
    public Order savetransactional(Order order);
    public Order save(Order order);
    public Order update(Order order);
    public Order findById(Integer id);
    public void delete(Integer id);

}
