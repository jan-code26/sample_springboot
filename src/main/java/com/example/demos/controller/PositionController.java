package com.example.demos.controller;

import com.example.demos.entity.Position;
import com.example.demos.repository.PositionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PositionController {
    @Autowired
    private PositionRespository positionRespository;

    @GetMapping("/getpositions")
    public List<Position> getAllPositions(){
        return (List<Position>) positionRespository.findAll();
    }

    @PostMapping("/saveposition")
    public ResponseEntity<Position> save(@RequestBody Position position){
        positionRespository.save(position);
        return ResponseEntity.ok(position);
    }
}
