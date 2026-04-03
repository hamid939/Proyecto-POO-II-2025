package com.practica.Service;

import java.util.List;

import com.practica.Entity.User;

public interface IUserService {
	
	public List<User> findAll();
    public User savetransactional(User user);
    public User save(User user);
    public User update(User user);
    public User findById(Integer id);
    public void delete(Integer id);

}
