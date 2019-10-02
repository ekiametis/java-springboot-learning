package com.emmanuelkiametis.learningspringboot.learningspringboot.service;

import com.emmanuelkiametis.learningspringboot.learningspringboot.database.model.User;
import com.emmanuelkiametis.learningspringboot.learningspringboot.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Mono<User> findUserByName (String name) {
        return userRepository.findByName(name);
    }

    public Flux<User> findAllUsers () {
        return userRepository.findAll();
    }
}
