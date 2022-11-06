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
    public String getHome(Model model) {
        System.out.println("Inside resultsDebugQaz");
        final String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println("currentUserName " + currentUserName);
        UserAnswersResult answersResults = webService.getResultMethod(currentUserName);
        System.out.println(answersResults.getPhysMat());
        model.addAttribute("answersResults", answersResults);
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
    @GetMapping("languageChoose")
    public String getLanguageChoose() {
        System.out.println("Inside languageChoose");
        return "languageChoose";
    }
    @GetMapping("instructions1")
    public String getInstructions1() {
        System.out.println("Inside instructions1");
        return "instructions1";
    }
    @GetMapping("instructions1Qaz")
    public String getInstructions1Qaz() {
        System.out.println("Inside instructions1Qaz");
        return "instructions1Qaz";
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

    @GetMapping("surveyQaz")
    public String getSurveyQaz(@ModelAttribute SurveyRequest surveyRequest, Model model) {
        model.addAttribute("surveyRequest", surveyRequest);
        System.out.println("Inside surveyQaz");
        return "surveyQaz";
    }

    @PostMapping("surveyQaz")
    public String saveSurveyQaz(@ModelAttribute("surveyRequest") SurveyRequest surveyRequest) {
        System.out.println("Inside surveyQaz");

        System.out.println("surveyRequest: " + surveyRequest.toString());
        final String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        surveyRequest.setCurrentUsername(currentUserName);
        webService.saveSurvey(surveyRequest);

        return "instructions2Qaz";
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
    @GetMapping("testQaz")
    public String getTestQaz(@ModelAttribute TestRequest testRequest, Model testModel) {
        testModel.addAttribute("testRequest", testRequest);
        System.out.println("Inside testQaz");
        return "testQaz";
    }
    @PostMapping("testQaz")
    public String saveTestQaz(@ModelAttribute("testRequest") TestRequest testRequest) {
        System.out.println("Inside testQaz");

        final String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        testRequest.setCurrentUsername(currentUserName);
        //webService.saveQuestions(testRequest);
        webService.evaluateAnswers(testRequest);

        return "instructions3Qaz";
    }

    @GetMapping("instructions3")
    public String getInstructions3() {
        System.out.println("Inside instructions3");
        return "instructions3";
    }
    @GetMapping("instructions3Qaz")
    public String getInstructions3Qaz() {
        System.out.println("Inside instructions3Qaz");
        return "instructions3Qaz";
    }
    @GetMapping("resultsDebug")
    public String getResult(Model model) {
        System.out.println("Inside resultsDebugQaz");
        final String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        UserAnswersResult answersResults = webService.getResultMethod(currentUserName);
        model.addAttribute("answersResults", answersResults);
        return "resultsDebug";
    }
    @GetMapping("resultsDebugQaz")
    public String getResultQaz(Model model) {
        System.out.println("Inside resultsDebugQaz");
        final String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
        UserAnswersResult answersResults = webService.getResultMethod(currentUserName);
        model.addAttribute("answersResults", answersResults);
        return "resultsDebugQaz";
    }
    @GetMapping("admin")
    public String goToAdminPage() {
        System.out.println("Inside Admin");
        return "admin";
    }
}
