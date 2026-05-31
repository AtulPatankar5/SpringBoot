package com.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	
	List<User> findByName(String name);
	
	List<User> findByNameAndCity(String name, String city);

	List<User> findByNameStartingWith(String name);
	
}
