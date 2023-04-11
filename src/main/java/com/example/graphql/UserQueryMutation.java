package com.example.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.entity.User;
import com.example.services.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserQueryMutation implements GraphQLMutationResolver {

    final UserService userService;

    public UserQueryMutation(UserService userService) {
        this.userService = userService;
    }

    public User createUser(String username, String password, String firstname, String lastname, String email) {
        return userService.createUser(username, password, firstname, lastname, email);
    }
}
