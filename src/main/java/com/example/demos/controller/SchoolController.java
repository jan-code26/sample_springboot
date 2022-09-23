package com.example.demos.controller;


import com.example.demos.entity.School;
import com.example.demos.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {
    @Autowired
    private SchoolRepository schoolRepository;

    @GetMapping("/getschools")
    public List<School> getAllSchools(){
        return (List<School>) schoolRepository.findAll();
    }

    @PostMapping("/saveschool")
    public ResponseEntity<School> save(@RequestBody School school){
        schoolRepository.save(school);
        return ResponseEntity.ok(school);
    }
}
