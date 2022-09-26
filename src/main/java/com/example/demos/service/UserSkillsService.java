package com.example.demos.service;

import com.example.demos.entity.User;
import com.example.demos.entity.UserSkill;
import com.example.demos.repository.UserRepository;
import com.example.demos.repository.UserSkillRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSkillsService {

    @Autowired
    private UserSkillRespository userSkillRespository;
    @Autowired
    private UserRepository userRepository;
    public Object getAllSkills() {
        return userSkillRespository.findAll();
    }


    public void addSkillToUser(int userid, int skillid) {
        UserSkill userSkill = userSkillRespository.findById(skillid).get();
        userSkill.getUser().add(userRepository.findById(userid).get());
        userSkillRespository.save(userSkill);
    }
}
