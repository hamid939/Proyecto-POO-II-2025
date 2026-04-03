package com.practica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.Entity.Product;

public interface IProductRepository extends JpaRepository<Product,Integer>{

}
