package com.example.demos.controller;


import com.example.demos.entity.Experience;
import com.example.demos.repository.ExperienceRepository;
import com.example.demos.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @PostMapping("/addexperience")
    public ResponseEntity<String> saveExperience(@RequestBody Experience experience){
        experienceService.saveExperience(experience);
        return ResponseEntity.ok("Experience saved successfully");
    }

    @GetMapping("/experience")
    public Experience getExperience(@RequestBody int id){
        return experienceService.getExperience(id);
    }

    @GetMapping("/experiences")
    public Iterable<Experience> getExperiences(){
        return experienceService.getExperiences();
    }
}
