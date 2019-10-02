package com.emmanuelkiametis.learningspringboot.learningspringboot.controller;

import com.emmanuelkiametis.learningspringboot.learningspringboot.database.model.User;
import com.emmanuelkiametis.learningspringboot.learningspringboot.database.repository.UserRepository;
import com.emmanuelkiametis.learningspringboot.learningspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/{name}")
    public Mono<User> findUserByName (@PathVariable("name") String name) {
        return userService.findUserByName(name);
    }

    @GetMapping
    public Flux<User> findAllUsers () {
        return userService.findAllUsers();
    }
}
