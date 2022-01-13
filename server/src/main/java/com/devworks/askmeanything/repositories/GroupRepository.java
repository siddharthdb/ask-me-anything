package com.devworks.askmeanything.repositories;

import com.devworks.askmeanything.models.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group, String> {
}
