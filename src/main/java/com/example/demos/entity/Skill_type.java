package com.example.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "skill_type")
public class Skill_type {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "skill_type_id_seq")
    @Column(name = "id",nullable = false)
    private Integer id;

    @Column(name="skill_type",nullable = false)
    private String skill_type;

    @Column(name="skill_type_summary", length = 1000, nullable = false)
    private String skill_type_summary;

}
