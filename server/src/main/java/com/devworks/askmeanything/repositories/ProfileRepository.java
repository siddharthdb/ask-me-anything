package com.devworks.askmeanything.repositories;

import com.devworks.askmeanything.models.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {
}
