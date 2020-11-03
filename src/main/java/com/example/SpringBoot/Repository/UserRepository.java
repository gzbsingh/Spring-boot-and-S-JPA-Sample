package com.example.SpringBoot.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.SpringBoot.utils.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByNameAndCity(String Name,String City);
	public List<User> findByNameStartingWith(String Letter);
	
	@Query("select u From User u")
	List<User> getAllUser();
	
}
