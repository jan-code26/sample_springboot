package com.example.demos.service;


import com.example.demos.entity.Position;
import com.example.demos.repository.PositionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {
    //service class for position
    @Autowired
    private PositionRespository positionRespository;

    public Position savePosition(Position position){
        return positionRespository.save(position);
    }

    public Position getPosition(int id){
        return positionRespository.findById(id).get();
    }

    public Iterable<Position> getPositions(){
        return positionRespository.findAll();
    }
}
