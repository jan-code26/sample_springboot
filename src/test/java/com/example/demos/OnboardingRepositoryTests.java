package com.example.demos;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.demos.entity.Onboarding;
import com.example.demos.entity.User;
import com.example.demos.repository.OnboardingRespository;
import com.example.demos.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class OnboardingRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private OnboardingRespository repo;

    @Test
    public void testCreateOnboarding() {
        Onboarding onboarding = new Onboarding();
        onboarding.setEmail("john@gmail.com");
        onboarding.setPassword("12456");

        Onboarding savedOnboarding = repo.save(onboarding);

        Onboarding existOnboarding = entityManager.find(Onboarding.class, savedOnboarding.getId());
        assertThat(onboarding.getEmail()).isEqualTo(existOnboarding.getEmail());
        assertThat(onboarding.getPassword()).isEqualTo(existOnboarding.getPassword());

    }
}