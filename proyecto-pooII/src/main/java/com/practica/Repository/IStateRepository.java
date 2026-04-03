package com.practica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.Entity.State;

public interface IStateRepository extends JpaRepository<State,Integer>{

}
