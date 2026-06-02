package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findByName(String name);

	List<User> findByNameAndCity(String name, String city);

	List<User> findByNameStartingWith(String name);

	//Executing JPQL 
	@Query("select u from User u")
	List<User> getAllUsers();

	@Query("select u from User u where u.name= :n")
	List<User > getUserByName(@Param("n") String name);
	
	//Native Query 
	@Query(value="select * from users", nativeQuery = true)
	List<User> getAllUserNative();
}
