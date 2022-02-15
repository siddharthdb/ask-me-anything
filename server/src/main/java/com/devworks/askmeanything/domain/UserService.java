package com.devworks.askmeanything.domain;

import com.devworks.askmeanything.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserRepository userRepository;


}
