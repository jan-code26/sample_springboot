package com.example.demos.repository;

import ch.qos.logback.core.net.SMTPAppenderBase;
import com.example.demos.entity.Onboarding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OnboardingRespository extends JpaRepository<Onboarding, Integer> {

    //function to check if user exists CrudRe
    public Onboarding findByEmail(String email);
}

