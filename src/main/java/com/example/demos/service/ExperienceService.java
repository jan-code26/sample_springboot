package com.example.demos.service;


import com.example.demos.entity.Experience;
import com.example.demos.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {
    //service class for experience

    @Autowired
    private ExperienceRepository experienceRepository;

    public Experience saveExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    public Experience getExperience(int id) {
        return experienceRepository.findById(id).get();
    }

    public Iterable<Experience> getExperiences() {
        return experienceRepository.findAll();
    }

}
