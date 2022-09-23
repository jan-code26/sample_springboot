package com.example.demos.repository;

import com.example.demos.entity.Position;
import org.springframework.data.repository.CrudRepository;

public interface PositionRespository extends CrudRepository<Position, Integer> {

}

