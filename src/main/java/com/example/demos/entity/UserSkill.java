package com.example.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "user_skill")
public class UserSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "user_skill_id_seq")
    @Column(name = "id")
    private Integer id;

    @OneToOne(targetEntity = Skill_type.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id")
    private Skill_type skill_type;

    @Column(name = "skill_summary", length = 1000)
    private String skill_summary;
}
