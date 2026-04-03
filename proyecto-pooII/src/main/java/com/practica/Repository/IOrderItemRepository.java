package com.practica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.Entity.OrderItem;

public interface IOrderItemRepository extends JpaRepository<OrderItem,Integer>{

}
