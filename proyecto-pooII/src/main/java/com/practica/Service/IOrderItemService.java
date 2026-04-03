package com.practica.Service;

import java.util.List;

import com.practica.Entity.OrderItem;

public interface IOrderItemService {
	
	public List<OrderItem> findAll();
    public OrderItem savetransactional(OrderItem orderItem);
    public OrderItem save(OrderItem orderItem);
    public OrderItem update(OrderItem orderItem);
    public OrderItem findById(Integer id);
    public void delete(Integer id);

}
