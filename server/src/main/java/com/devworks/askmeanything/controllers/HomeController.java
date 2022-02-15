package com.devworks.askmeanything.controllers;

import com.devworks.askmeanything.models.representation.Home;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HomeController {

    private static final String TEMPLATE = "Hello, %s!";

    @GetMapping("/home")
    public HttpEntity<Home> Index(@RequestParam(value = "name", defaultValue = "World") String name) {

            Home home = new Home(String.format(TEMPLATE, name));
            home.add(linkTo(methodOn(HomeController.class).Index(name)).withSelfRel());

            return new ResponseEntity<>(home, HttpStatus.OK);
    }
}
