package com.example.demos.controller;


import com.example.demos.entity.Address;
import com.example.demos.entity.User;
import com.example.demos.repository.AddressRespository;
import com.example.demos.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/add/{id}")
    public ResponseEntity<User> saveAddress(@RequestBody Address address, @PathVariable("id") int id){
        return ResponseEntity.ok(addressService.saveAddress(address, id));
    }

    @GetMapping("/{id}")
    public Address getAddress(@RequestBody int id){
        return addressService.getAddress(id);
    }

    @GetMapping("/addresses")
    public Iterable<Address> getAddresses(){
        return addressService.getAddresses();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable("id") int id, @RequestBody Address address){
        return ResponseEntity.ok(addressService.updateAddress(id, address));
    }


}
