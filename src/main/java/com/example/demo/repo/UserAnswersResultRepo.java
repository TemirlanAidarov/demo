package com.example.demo.repo;

import com.example.demo.entity.AppUser;
import com.example.demo.entity.UserAnswersResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserAnswersResultRepo extends JpaRepository<UserAnswersResult, Long> {
    //List<UserAnswersResult> findAllByCurrentUsername(String email);
    UserAnswersResult findByCurrentUsername(String email);

}
