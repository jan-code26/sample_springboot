package com.example.demos.controller;

import com.example.demos.repository.UserRepository;
import com.example.demos.repository.UserSkillRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSkillController {
    @Autowired
    private UserSkillRespository userSkillRespository;

    @GetMapping("/getuserskills")
    public String getAllUserSkills(){
        return "Hello";
    }

}

