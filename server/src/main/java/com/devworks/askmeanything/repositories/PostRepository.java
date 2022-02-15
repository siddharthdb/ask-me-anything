package com.devworks.askmeanything.repositories;

import com.devworks.askmeanything.models.data.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
