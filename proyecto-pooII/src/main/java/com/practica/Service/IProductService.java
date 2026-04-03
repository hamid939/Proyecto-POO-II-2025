package com.practica.Service;

import java.util.List;

import com.practica.Entity.Product;

public interface IProductService {
	
	public List<Product> findAll();
    public Product savetransactional(Product product);
    public Product save(Product product);
    public Product update(Product product);
    public Product findById(Integer id);
    public void delete(Integer id);

}
