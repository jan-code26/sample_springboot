package com.example.demos.service;

import com.example.demos.entity.Organisation;
import com.example.demos.repository.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganisationService {
    //service class for organisation

    @Autowired
    private OrganisationRepository organisationRepository;

    public Organisation saveOrganisation(Organisation organisation){
        return organisationRepository.save(organisation);
    }

    public Organisation getOrganisation(int id){
        return organisationRepository.findById(id).get();
    }

    public Iterable<Organisation> getOrganisations(){
        return organisationRepository.findAll();
    }

}
