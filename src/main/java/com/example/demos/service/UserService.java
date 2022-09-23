package com.example.demos.service;

import com.example.demos.entity.Onboarding;
import com.example.demos.entity.User;
import com.example.demos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OnboardingService onboardingService;


    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(int id, User user) {
        /* get user from db */
        User userFromDb = userRepository.findById(id).orElse(null);
        /* update user if not null */
        if (userFromDb != null) {
            userFromDb.setFirst_name(user.getFirst_name());
            userFromDb.setLast_name(user.getLast_name());
            userFromDb.setDob(user.getDob());
            userFromDb.setSummary(user.getSummary());
            return userRepository.save(userFromDb);
        }
        return null;
    }

    public User addUser(int id, User user) {
        //get onboarding from db
        Onboarding onboarding = onboardingService.findById(id).orElse(null);
        user.setOnboarding(onboarding);
        try {
            user.setEmail(onboarding.getEmail());
            return userRepository.save(user);
        }
        catch (Exception e){
            return null;
        }
    }
}
