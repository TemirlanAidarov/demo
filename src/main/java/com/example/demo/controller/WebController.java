package com.example.demo.controller;

import com.example.demo.entity.UserAnswersResult;
import com.example.demo.model.SurveyRequest;
import com.example.demo.model.TestRequest;
import com.example.demo.service.WebService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@AllArgsConstructor
@Controller
@RequestMapping("/")
public class WebController {
    private final WebService webService;

    @GetMapping("")
    public String getDefault() {
        System.out.println("Inside Home");
        return "home";
    }
    @GetMapping("home")
    public String getHome() {
        System.out.println("Inside Home");
        return "home";
    }
    @GetMapping("about")
    public String getAbout() {
        System.out.println("Inside about");
        return "about";
    }
    @GetMapping("myAccount")
    public String getMyAccount() {
        System.out.println("Inside myAccount");
        return "myAccount";
    }
    @GetMapping("instructions1")
    public String getInstructions1() {
        System.out.println("Inside instructions1");
        return "instructions1";
    }
    @GetMapping("survey")
    public String getSurvey(@ModelAttribute SurveyRequest surveyRequest, Model model) {
        model.addAttribute("surveyRequest", surveyRequest);
        System.out.println("Inside surveyRequest");
        return "survey";
    }

    @PostMapping("survey")
    public String saveSurvey(@ModelAttribute("surveyRequest") SurveyRequest surveyRequest) {
        System.out.println("Inside surveyRequest");

        System.out.println("surveyRequest: " + surveyRequest.toString());
        final String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        surveyRequest.setCurrentUsername(currentUserName);
        webService.saveSurvey(surveyRequest);

        return "instructions2";
    }

    @GetMapping("test")
    public String getTest(@ModelAttribute TestRequest testRequest, Model testModel) {
        testModel.addAttribute("testRequest", testRequest);
        System.out.println("Inside test");
        return "test";
    }
    @PostMapping("test")
    public String saveTest1(@ModelAttribute("testRequest") TestRequest testRequest) {
        System.out.println("Inside register");

        final String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        testRequest.setCurrentUsername(currentUserName);
        //webService.saveQuestions(testRequest);
        webService.evaluateAnswers(testRequest);

        return "instructions3";
    }
    @GetMapping("instructions3")
    public String getInstructions3() {
        System.out.println("Inside instructions3");
        return "instructions3";
    }
    @GetMapping("resultsDebug")
    public String getResult(Model model) {
        System.out.println("Inside result");
        final String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        UserAnswersResult answersResults = webService.getResultMethod(currentUserName);
        model.addAttribute("answersResults", answersResults);
        return "resultsDebug";
    }
    @GetMapping("admin")
    public String goToAdminPage() {
        System.out.println("Inside Admin");
        return "admin";
    }
}
