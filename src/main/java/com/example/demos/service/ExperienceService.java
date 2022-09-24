package com.example.demos.service;


import com.example.demos.entity.Experience;
import com.example.demos.entity.User;
import com.example.demos.repository.ExperienceRepository;
import com.example.demos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {
    //service class for experience

    @Autowired
    private ExperienceRepository experienceRepository;
    @Autowired
    private UserRepository userRepository;

    public Experience saveExperience(Experience experience, int id){
        Experience storedExperience=experienceRepository.save(experience);
        User user = userRepository.findById(id).orElse(null);
        user.getExperiences().add(storedExperience);
        userRepository.save(user);
        return storedExperience;
    }

    public Experience getExperience(int id) {
        return experienceRepository.findById(id).get();
    }

    public Iterable<Experience> getExperiences() {
        return experienceRepository.findAll();
    }

    public void deleteExperience(int id) {
        experienceRepository.deleteById(id);
    }
}
