package com.practica.Service;

import java.util.List;

import com.practica.Entity.Tables;

public interface ITablesService {
	
	public List<Tables> findAll();
    public Tables savetransactional(Tables tables);
    public Tables save(Tables tables);
    public Tables update(Tables tables);
    public Tables findById(Integer id);
    public void delete(Integer id);

}
