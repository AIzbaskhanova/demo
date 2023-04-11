package com.example.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.entity.User;
import com.example.services.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class UserQuery implements GraphQLQueryResolver {

    final UserService userService;

    public UserQuery(UserService userService) {
        this.userService = userService;
    }

    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    public Optional<User> getUser(Long id) {
        return userService.getUser(id);
    }
}
