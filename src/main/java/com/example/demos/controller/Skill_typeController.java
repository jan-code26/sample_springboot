package com.example.demos.controller;


import com.example.demos.entity.Skill_type;
import com.example.demos.repository.Skill_typeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Skill_typeController {
    @Autowired
    private Skill_typeRespository skill_typeRespository;

    @GetMapping("/getskill_types")
    public List<Skill_type> getAllSkill_types(){
        return (List<Skill_type>) skill_typeRespository.findAll();
    }

    @PostMapping("/saveskill_type")
    public ResponseEntity<Skill_type> save(@RequestBody Skill_type skill_type){
        skill_typeRespository.save(skill_type);
        return ResponseEntity.ok(skill_type);
    }

}
