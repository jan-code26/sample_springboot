package com.example.demos.controller;

import com.example.demos.repository.UserRepository;
import com.example.demos.repository.UserSkillRespository;
import com.example.demos.service.UserSkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("skill")
public class UserSkillController {
    @Autowired
    private UserSkillsService userSkillsService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllSkills(){
        return ResponseEntity.ok(userSkillsService.getAllSkills());
    }

    @PostMapping("/add/{userid}/{skillid}")
    public void addSkillToUser(@PathVariable("userid") int userid, @PathVariable("skillid") int skillid){
        userSkillsService.addSkillToUser(userid, skillid);
    }


}

