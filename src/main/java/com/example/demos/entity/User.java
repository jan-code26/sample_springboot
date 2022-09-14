package com.example.demos.entity;

import javax.persistence.*;

@Entity
@Table(name = "profile")
public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "id")
     private Integer id;
     @Column(name="first_name",nullable = false)
     private String first_name;
        @Column(name="last_name",nullable = false)
     private String last_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
