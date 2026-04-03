package com.practica.Service;

import java.util.List;

import com.practica.Entity.State;

public interface IStateService {
	
	public List<State> findAll();
    public State savetransactional(State state);
    public State save(State state);
    public State update(State state);
    public State findById(Integer id);
    public void delete(Integer id);

}
