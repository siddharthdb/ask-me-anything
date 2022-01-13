package com.devworks.askmeanything.controllers;

import com.devworks.askmeanything.models.User;
import com.devworks.askmeanything.repositories.UserRepository;
import com.devworks.askmeanything.utils.BCryptPasswordEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/api/users")
    public List<User> GetAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/api/users/{userId}")
    public Optional<User> GetUser(@PathVariable String userId) {
        return userRepository.findById(userId);
    }

    @PostMapping("/api/users")
    public User SaveUser(@RequestBody User user) {
        user.setUEncryptedPassword(BCryptPasswordEncoderUtil.passwordEncoder().encode(user.password));
        return userRepository.save(user);
    }
    

}
