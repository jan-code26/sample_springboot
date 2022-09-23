package com.example.demos.service;

import com.example.demos.entity.Onboarding;
import com.example.demos.entity.User;
import com.example.demos.repository.OnboardingRespository;
import com.example.demos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Service
public class OnboardingService {
    //service class for login/registration

    @Autowired
    private OnboardingRespository onboardingRespository;

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<?> login(Onboarding onboarding) {
        Onboarding user = onboardingRespository.findByEmail(onboarding.getEmail());
        if (user != null) {
            if (user.getPassword().equals(onboarding.getPassword())) {
                //find user by id in profile
                User user1 = userRepository.findById(user.getId()).orElse(null);
                return ResponseEntity.ok(user1);
            } else {
                return ResponseEntity.ok("Incorrect password");
            }
        } else {
            return ResponseEntity.ok("User does not exist");
        }
    }

    public Onboarding registerUser(Onboarding onboarding){
            return onboardingRespository.save(onboarding);
    }

    public Optional<Onboarding> findById(int id) {
        return onboardingRespository.findById(id);
    }
}
