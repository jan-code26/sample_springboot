package com.example.demos.controller;


import com.example.demos.entity.Experience;
import com.example.demos.entity.User;
import com.example.demos.repository.ExperienceRepository;
import com.example.demos.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @PostMapping("/add/{id}")
    public ResponseEntity<Experience> saveExperience(@PathVariable("id") int id, @RequestBody Experience experience ){
        return ResponseEntity.ok(experienceService.saveExperience(experience, id));
    }

    @GetMapping("/get/{id}")
    public Experience getExperience(@PathVariable("id") int id){
        return experienceService.getExperience(id);
    }

//    @GetMapping("/experiences")
//    public Iterable<Experience> getExperiences(){
//        return experienceService.getExperiences();
//    }

    @DeleteMapping("/delete/{id}")
    public void deleteExperience(@PathVariable("id") int id){
        experienceService.deleteExperience(id);
    }
}
