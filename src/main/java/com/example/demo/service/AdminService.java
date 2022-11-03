package com.example.demo.service;

import com.example.demo.entity.AppUser;
import com.example.demo.repo.AppUserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
@AllArgsConstructor
public class AdminService {
    @Autowired
    private AppUserRepo appUserRepo;
    public List<AppUser> getAllUsers() {
        return appUserRepo.findAll();
    }
}
