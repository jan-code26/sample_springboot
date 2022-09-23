package com.example.demos.controller;

import com.example.demos.entity.User;
import com.example.demos.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


//send user object

    @GetMapping("/get/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") int id) {
        User user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") int id, @RequestBody User user){
        user = userService.updateUser(id, user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/post/{id}")
    public ResponseEntity<User> addUser(@PathVariable("id") int id, @RequestBody User user){
        user = userService.addUser(id, user);
        return ResponseEntity.ok(user);
    }


}
