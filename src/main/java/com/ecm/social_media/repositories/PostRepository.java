package com.ecm.social_media.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecm.social_media.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}