package com.example.demo.service;

import com.example.demo.entity.AppUser;
import com.example.demo.repo.AppUserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AppUserRepo appUserRepo;

    public AdminService(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }

    public List<AppUser> getAllUsers() {
        return appUserRepo.findAll();
    }
}
