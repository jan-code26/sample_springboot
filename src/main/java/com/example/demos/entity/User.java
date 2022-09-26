package com.example.demos.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.MutablePropertyValues;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "profile")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "profile_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name="first_name",nullable = false)
    private String first_name;
    @Column(name="last_name",nullable = false)
    private String last_name;
    @Column(name="dob",nullable = false)
    private String dob;
    @Column(name="summary",nullable = false,length = 1000)
    private String summary;
    @Column(name="email",unique = true,nullable = false)
    private String email;

    @OneToOne(targetEntity = Onboarding.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "login_id")
    private Onboarding onboarding;

    @OneToOne(targetEntity = Address.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "Address_id")
    private Address address;

    @OneToMany(targetEntity = Education.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private Set<Education> education;

    @OneToMany(targetEntity = Experience.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private Set<Experience> experience;

    @OneToMany(targetEntity = UserSkill.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private Set<UserSkill> skill;

    public Set<Education> getEducations() {
        return education;
    }

    public Set<Experience> getExperiences() {
        return experience;
    }

    public Set<UserSkill> getSkills() {
        return skill;
    }
}
