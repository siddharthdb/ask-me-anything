package com.devworks.askmeanything.controllers;

import com.devworks.askmeanything.models.data.Profile;
import com.devworks.askmeanything.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    ProfileRepository profileRepository;

    @GetMapping("/{userId}")
    public Optional<Profile> GetUserProfile(@PathVariable String userId) {
        return profileRepository.findById(userId);
    }

    @PutMapping("/{userId}")
    public Profile UpdateUserProfile(@PathVariable String userId, @RequestBody Profile profile) {
       return profileRepository.save(profile);
    }
}
