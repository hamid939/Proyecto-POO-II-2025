package com.practica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.Entity.User;

public interface IUserRepository extends JpaRepository<User,Integer>{

}
