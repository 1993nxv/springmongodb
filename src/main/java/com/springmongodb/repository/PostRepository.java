package com.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongodb.domain.Post;


public interface PostRepository extends MongoRepository<Post, String>{

	
	
}
