package com.example.demos.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "education_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name="degree_name",nullable = false)
    private String degree_name;


    @Column(name="start_date",nullable = false)
    private String start_date;

    @Column(name="end_date")
    private String end_date;

    @Column(name="grade")
    private String grade;


    @Column(name="institution_name",nullable = false)
    private String institution_name;

    @Column(name="institution_location",nullable = false)
    private String institution_location;
}
