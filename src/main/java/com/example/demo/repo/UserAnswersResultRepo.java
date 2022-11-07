package com.example.demo.repo;

import com.example.demo.entity.UserAnswersResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswersResultRepo extends JpaRepository<UserAnswersResult, Long> {
    //List<UserAnswersResult> findAllByCurrentUsername(String email);
    UserAnswersResult findByCurrentUsername(String email);

}
