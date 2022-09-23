package com.example.demos.controller;

import com.example.demos.entity.Onboarding;
import com.example.demos.entity.User;
import com.example.demos.repository.OnboardingRespository;
import com.example.demos.service.OnboardingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/onboarding")
@CrossOrigin(origins = "http://localhost:4200")
public class OnboardingController {
    @Autowired
    private OnboardingService onboardingService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Onboarding onboarding){
        return ResponseEntity.ok(onboardingService.login(onboarding));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody Onboarding onboarding) {
        return ResponseEntity.ok(onboardingService.registerUser(onboarding));
    }

}

