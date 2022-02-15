package com.devworks.askmeanything.repositories;

import com.devworks.askmeanything.models.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{'username': ?0}")
    Optional<User> GetUserByUserName(String username);

    @Query("{'email': ?0}")
    Optional<User> IsEmailExists(String email);

}
