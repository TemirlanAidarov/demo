package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
