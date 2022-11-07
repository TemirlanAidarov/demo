package com.example.demo.repo;

import com.example.demo.entity.SurveyAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyAnswersRepo extends JpaRepository<SurveyAnswers, Long> {
    SurveyAnswers findByCurrentUsername(String email);
}
