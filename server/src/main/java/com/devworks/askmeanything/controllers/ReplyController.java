package com.devworks.askmeanything.controllers;

import com.devworks.askmeanything.models.Reply;
import com.devworks.askmeanything.repositories.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ReplyController {

    @Autowired
    ReplyRepository replyRepository;

    @GetMapping("/api/reply/{replyId}")
    public Optional<Reply> GetReplyById(@PathVariable String replyId) {
        return replyRepository.findById(replyId);
    }
}
