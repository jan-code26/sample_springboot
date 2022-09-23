package com.example.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "onboarding")
@Getter
@Setter
public class Onboarding {
@Id
@GeneratedValue(strategy= GenerationType.TABLE, generator="onboarding_id_seq")
@Column(name = "id")
private Integer id;

@Column(name = "email",unique = true,nullable = false)
private String email;

@Column(name = "password",length=8,nullable = false)
private String password;

}
