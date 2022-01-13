package com.devworks.askmeanything.repositories;

import com.devworks.askmeanything.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
