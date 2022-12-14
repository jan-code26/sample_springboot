package com.example.demos.controller;


import com.example.demos.entity.Education;
import com.example.demos.entity.User;
import com.example.demos.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/education")
public class EducationController {
    @Autowired
    private EducationService educationService;

    @PostMapping("/add/{id}")
    public ResponseEntity<User> saveEducation(@RequestBody Education education, @PathVariable("id") int id){
        return ResponseEntity.ok(educationService.saveEducation(education, id));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEducation(@PathVariable("id") int id){
        educationService.deleteEducation(id);
    }

    @GetMapping("/get/{id}")
    public Education getEducation(@PathVariable("id") int id){
        return educationService.getEducation(id);
    }

    @GetMapping("/educations")
    public Iterable<Education> getEducations(){
        return educationService.getEducations();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education, @PathVariable("id") int id){
        return ResponseEntity.ok(educationService.updateEducation(education, id));
    }

}

