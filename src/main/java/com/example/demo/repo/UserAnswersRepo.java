package com.example.demo.repo;

import com.example.demo.entity.UserAnswers;
import com.example.demo.entity.UserAnswersResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface UserAnswersRepo extends JpaRepository<UserAnswers, Long> {
    UserAnswers findByCurrentUsername(String email);
}
