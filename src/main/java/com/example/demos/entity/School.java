package com.example.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "school_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "school_name", nullable = false)
    private String school_name;


    @Column(name="summary",length = 1000)
    private String summary;

    @OneToOne(targetEntity = Address.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
}
