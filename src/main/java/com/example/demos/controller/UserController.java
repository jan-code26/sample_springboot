package com.example.demos.controller;

import com.example.demos.entity.User;
import com.example.demos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getusers")
    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }

}
