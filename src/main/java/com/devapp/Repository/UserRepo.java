package com.devapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devapp.Entity.Users;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer>{

	
	Users save(Users user);
	Users findByUserId(String userId);
}
