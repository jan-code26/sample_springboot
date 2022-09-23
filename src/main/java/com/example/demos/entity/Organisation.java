package com.example.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "organisation")
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "organisation_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name="Organisation_name")
    private String organisation_name;

    @Column(name="Organisation_summary", length = 1000, nullable = false)
    private String organisation_summary;

    @OneToOne(targetEntity = Address.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

}
