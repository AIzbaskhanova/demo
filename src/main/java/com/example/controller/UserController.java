package com.example.controller;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    private final UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @QueryMapping
    public List<User> users() {
        return userRepository.findAll();
    }

    @QueryMapping
    Optional<User> userById(@Argument Long id) {
        return userRepository.findById(id);
    }

    @MutationMapping
    User addUser(@Argument User user) {
        return userRepository.save(user);
    }

}
