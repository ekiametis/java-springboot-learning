package com.emmanuelkiametis.learningspringboot.learningspringboot.controller;

import com.emmanuelkiametis.learningspringboot.learningspringboot.database.model.User;
import com.emmanuelkiametis.learningspringboot.learningspringboot.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/{name}")
    public Mono<User> helloUser (@PathVariable("name") String name) {
        return userRepository.findByName(name);
    }

    @GetMapping
    public Flux<User> findAllUsers () {
        return userRepository.findAll();
    }
}
