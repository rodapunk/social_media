package com.ecm.social_media.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecm.social_media.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}