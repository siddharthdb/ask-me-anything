package com.devworks.askmeanything.controllers;

import com.devworks.askmeanything.models.Profile;
import com.devworks.askmeanything.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProfileController {

    @Autowired
    ProfileRepository profileRepository;

    @GetMapping("/api/profile/{userId}")
    public Optional<Profile> GetUserProfile(@PathVariable String userId) {
        return profileRepository.findById(userId);
    }
}
