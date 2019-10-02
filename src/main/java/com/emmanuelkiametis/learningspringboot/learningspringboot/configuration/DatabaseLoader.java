package com.emmanuelkiametis.learningspringboot.learningspringboot.configuration;

import com.emmanuelkiametis.learningspringboot.learningspringboot.database.model.User;
import com.emmanuelkiametis.learningspringboot.learningspringboot.database.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import reactor.core.publisher.Flux;

@Configuration
public class DatabaseLoader {

    @Bean
    CommandLineRunner init(MongoOperations operations, UserRepository userRepository) {
        return (args) -> {

            operations.dropCollection(User.class);

            Flux.just(
                    new User("Emmanuel"),
                    new User("Graciele"),
                    new User("Bernardo"))
            .flatMap(userRepository::save)
            .subscribe(System.out::println);
        };
    }
}
