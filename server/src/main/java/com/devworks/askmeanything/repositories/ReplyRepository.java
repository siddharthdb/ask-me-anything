package com.devworks.askmeanything.repositories;

import com.devworks.askmeanything.models.data.Reply;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReplyRepository extends MongoRepository<Reply, String> {
}
