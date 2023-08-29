package com.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongodb.domain.User;


public interface UserRepository extends MongoRepository<User, String>{

	
	
}
