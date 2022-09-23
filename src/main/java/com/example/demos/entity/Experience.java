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

    @OneToOne(targetEntity = Organisation.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "organisation_id",referencedColumnName = "id")
    private Organisation organisation;


    @Column(name="exp_summary",nullable = false,length = 1000)
    private String exp_summary;

    @Column(name="start_date",nullable = false)
    private String start_date;

    @Column(name="end_date")
    private String end_date;

    @OneToMany(targetEntity = Position.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "experience_id",referencedColumnName = "id")
    private Set<Position> position;

}
