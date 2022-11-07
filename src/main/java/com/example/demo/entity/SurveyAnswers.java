package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class SurveyAnswers {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @Column
    private String currentUsername;
    @Column
    private String surveyPath;
    @Column
    private String surveyFactor;
    @Column
    private String surveySubject;
    @Column
    private String surveyCountry;
    @Column
    private String surveyScholar;
    @Column
    private String surveyENT;


    //@ManyToOne
    //@JoinColumn(
    //        nullable = false,
    //        name = "app_user_id"
    //)
    //private AppUser appUser;

    public SurveyAnswers(String currentUsername, String surveyPath, String surveyFactor,
                         String surveySubject, String surveyCountry, String surveyScholar, String surveyENT) {
        this.currentUsername = currentUsername;
        this.surveyPath = surveyPath;
        this.surveyFactor = surveyFactor;
        this.surveySubject = surveySubject;
        this.surveyCountry = surveyCountry;
        this.surveyScholar = surveyScholar;
        this.surveyENT = surveyENT;
    }

    public SurveyAnswers() {

    }
}
