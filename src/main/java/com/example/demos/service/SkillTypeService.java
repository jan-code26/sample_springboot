package com.example.demos.service;


import com.example.demos.entity.Skill_type;
import com.example.demos.repository.Skill_typeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillTypeService {
    @Autowired
    private Skill_typeRespository skillTypeRepository;

    public Skill_type saveSkillType(Skill_type skillType){
        return skillTypeRepository.save(skillType);
    }

    public Skill_type getSkillType(int id){
        return skillTypeRepository.findById(id).get();
    }

    public Iterable<Skill_type> getSkillTypes(){
        return skillTypeRepository.findAll();
    }
}
