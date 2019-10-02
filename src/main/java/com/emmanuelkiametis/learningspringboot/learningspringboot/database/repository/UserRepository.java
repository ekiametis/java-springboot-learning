package com.emmanuelkiametis.learningspringboot.learningspringboot.database.repository;

import com.emmanuelkiametis.learningspringboot.learningspringboot.database.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, String> {

    Mono<User> findByName(String name);
}
