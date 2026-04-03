package com.practica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.Entity.Order;

public interface IOrderRepository extends JpaRepository<Order,Integer>{

}
