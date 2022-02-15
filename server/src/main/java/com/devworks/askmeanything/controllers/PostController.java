package com.devworks.askmeanything.controllers;

import com.devworks.askmeanything.models.data.Post;
import com.devworks.askmeanything.models.data.Reply;
import com.devworks.askmeanything.repositories.PostRepository;
import com.devworks.askmeanything.repositories.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    ReplyRepository replyRepository;

    @GetMapping("/")
    public List<Post> GetPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/{postId}")
    public Optional<Post> GetPostDetails(@PathVariable String postId) {
        return postRepository.findById(postId);
    }

//    @PostMapping("/{postId}/reply")
//    public Reply AddReplyPost(@PathVariable String postId, @RequestBody Reply reply) {
//        reply.post.Id = postId;
//
//        Reply savedReply = replyRepository.save(reply);
//
//        if (savedReply != null) {
//          Post updatedPost = postRepository.findById(postId);
//          updatedPost.replies.
//        }
//    }
}
