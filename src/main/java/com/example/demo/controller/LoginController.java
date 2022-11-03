package com.example.demo.controller;

import com.example.demo.model.RegistrationRequest;
import com.example.demo.model.ResetRequest;
import com.example.demo.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping("login")
    public String getLoginView() {
        System.out.println("Inside GetMapping");
        return "login";
    }
    @GetMapping("logout")
    public String logout() {
        System.out.println("Inside Logout");
        return "login";
    }
}
