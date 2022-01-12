package com.devworks.askmeanything.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String GetIndex() {
        return "Hello! Welcome to Ask Me Anything!";
    }
}
