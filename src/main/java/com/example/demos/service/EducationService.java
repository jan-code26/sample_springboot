package com.example.demos.service;

import com.example.demos.entity.Education;
import com.example.demos.entity.User;
import com.example.demos.repository.EducationRespository;
import com.example.demos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EducationService {
    //service class for education

    @Autowired
    private EducationRespository educationRespository;
    @Autowired
    private UserRepository userRepository;

    public User saveEducation(Education education, int id){
        //get user from db
        Education storedEducation=educationRespository.save(education);
        //set user to education
            User user = userRepository.findById(id).orElse(null);
            user.getEducations().add(storedEducation);
            userRepository.save(user);
            return user;


    }

    public Education getEducation(int id){
        return educationRespository.findById(id).get();
    }

    public Iterable<Education> getEducations(){
        return educationRespository.findAll();
    }

    public void deleteEducation(int id) {
        educationRespository.deleteById(id);
    }

    public Education updateEducation(Education education, int id) {
        Education storedEducation=educationRespository.findById(id).get();
        storedEducation.setDegree_name(education.getDegree_name());
        storedEducation.setInstitution_name(education.getInstitution_name());
        storedEducation.setSummary(education.getSummary());
        storedEducation.setStart_date(education.getStart_date());
        storedEducation.setEnd_date(education.getEnd_date());
        storedEducation.setInstitution_location(education.getInstitution_location());
        educationRespository.save(storedEducation);

        return storedEducation;
     }
}
