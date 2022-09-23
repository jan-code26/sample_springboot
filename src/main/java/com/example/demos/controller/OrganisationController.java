package com.example.demos.controller;


import com.example.demos.entity.Organisation;
import com.example.demos.repository.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class OrganisationController {
@Autowired
private OrganisationRepository organisationRepository;

    @GetMapping("/getorganisations")
    public List<Organisation> getAllOrganisations(){
        return (List<Organisation>) organisationRepository.findAll();
    }

    @PostMapping("/saveorganisation")
    public ResponseEntity save(@RequestBody Organisation organisation){
        organisationRepository.save(organisation);
        return ResponseEntity.ok(organisation);
    }
}

