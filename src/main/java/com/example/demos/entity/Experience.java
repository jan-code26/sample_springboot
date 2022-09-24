package com.example.demos.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "experience_id_seq")
    @Column(name = "id")
    private Integer id;



    @Column(name="exp_summary",nullable = false,length = 1000)
    private String exp_summary;

    @Column(name="start_date",nullable = false)
    private String start_date;

    @Column(name="end_date")
    private String end_date;


    @Column(name="position",nullable = false)
    private String position;

    @Column(name="organisation_name",nullable = false)
    private String organisation_name;

    @Column(name="organisation_location",nullable = false)
    private String organisation_location;



}
