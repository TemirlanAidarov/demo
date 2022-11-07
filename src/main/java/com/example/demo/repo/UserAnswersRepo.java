package com.example.demo.repo;

import com.example.demo.entity.UserAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswersRepo extends JpaRepository<UserAnswers, Long> {
    UserAnswers findByCurrentUsername(String email);
}
