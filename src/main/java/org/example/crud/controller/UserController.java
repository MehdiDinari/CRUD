package org.example.crud.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.example.crud.model.User;
import org.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User addUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }
    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
