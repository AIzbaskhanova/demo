package com.example.services;

import com.example.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUser(Long id);
    User createUser(String username, String password, String firstname, String lastname, String email);


}
