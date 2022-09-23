package com.example.demos.repository;


import com.example.demos.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRespository extends CrudRepository<Address, Integer> {

}

