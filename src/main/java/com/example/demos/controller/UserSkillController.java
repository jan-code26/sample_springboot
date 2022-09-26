package com.example.demos.controller;

import com.example.demos.repository.UserRepository;
import com.example.demos.repository.UserSkillRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skill")
public class UserSkillController {
    @Autowired
    private UserSkillRespository userSkillRespository;

    @GetMapping("/all")
    public ResponseEntity<?> getAllSkills(){
        return ResponseEntity.ok(userSkillRespository.findAll());
    }

}

