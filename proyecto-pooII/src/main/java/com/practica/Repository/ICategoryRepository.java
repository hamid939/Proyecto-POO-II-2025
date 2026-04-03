package com.practica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.Entity.Category;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
