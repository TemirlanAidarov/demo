package com.example.demo.controller;

import com.example.demo.entity.AppUser;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/admin123")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping()
    public List<AppUser> getUSERS() {
        //return appUserRepo.findAll();
        return adminService.getAllUsers();
    }
}
