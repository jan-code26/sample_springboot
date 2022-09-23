package com.example.demos.repository;

import com.example.demos.entity.Organisation;
import org.springframework.data.repository.CrudRepository;

public interface OrganisationRepository extends CrudRepository<Organisation, Integer> {

}
