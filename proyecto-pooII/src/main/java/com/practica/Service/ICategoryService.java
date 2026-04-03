package com.practica.Service;

import java.util.List;

import com.practica.Entity.Category;



public interface ICategoryService {
	
	public List<Category> findAll();
    public Category savetransactional(Category category);
    public Category save(Category category);
    public Category update(Category category);
    public Category findById(Integer id);
    public void delete(Integer id);

}
