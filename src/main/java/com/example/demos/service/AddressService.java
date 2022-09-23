package com.example.demos.service;

import com.example.demos.entity.Address;
import com.example.demos.entity.User;
import com.example.demos.repository.AddressRespository;
import com.example.demos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class AddressService {
    //service class for address
    @Autowired
    private AddressRespository addressRepository;
    @Autowired
    private UserRepository userRepository;

    public User saveAddress(Address address, int id){
        //get user from db
        Address storedadd=addressRepository.save(address);
        User user = userRepository.findById(id).orElse(null);
        //set user to address
        if(user != null){
            user.setAddress(storedadd);
            userRepository.save(user);
            return user;
        }
        return null;

    }

    public Address getAddress(int id){
        return addressRepository.findById(id).get();
    }


    public Iterable<Address> getAddresses() {
        return addressRepository.findAll();
    }

    public Address updateAddress(int id, Address address){
        Address addressFromDb = addressRepository.findById(id).orElse(null);
        if(addressFromDb != null){
            addressFromDb = address;
            return addressRepository.save(addressFromDb);
        }
        return null;
    }
}
