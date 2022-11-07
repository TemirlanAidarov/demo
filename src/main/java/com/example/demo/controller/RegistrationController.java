package com.example.demo.controller;

import com.example.demo.model.RegistrationRequest;
import com.example.demo.model.ResetRequest;
import com.example.demo.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    private final RegistrationService registrationService;
    private static final Logger log = LoggerFactory.getLogger(RegistrationController.class);

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/registration")
    public String getRegistrationView(@ModelAttribute RegistrationRequest registrationRequest, Model model) {
        model.addAttribute("registrationRequest", registrationRequest);
        System.out.println("Inside getRegistrationView");
        return "registration";
    }

    @PostMapping("/registration")
    public String saveUser(@ModelAttribute("registrationRequest") RegistrationRequest registrationRequest) {
        System.out.println("Inside register");

        System.out.println("registrationRequest: " + registrationRequest.toString());
        registrationService.register(registrationRequest);

        return "checkYourEmail";
    }

    @GetMapping("/resetPassword")
    public String goResetPage(@ModelAttribute ResetRequest resetRequest, Model model) {
        model.addAttribute("resetRequest", resetRequest);
        System.out.println("Inside goResetPage");
        return "resetPassword";
    }

    @PostMapping("/resetPassword")
    public String postResetPage(@ModelAttribute("resetRequest") ResetRequest resetRequest) {
        System.out.println("Inside ResetRequest");
        registrationService.reset(resetRequest);
        return "checkYourEmail";
    }

}
