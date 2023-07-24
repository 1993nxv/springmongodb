package com.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
	
}
