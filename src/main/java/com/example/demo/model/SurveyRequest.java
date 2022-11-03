package com.example.demo.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class SurveyRequest {
    private String currentUsername;
    private String surveyPath;
    private String surveyFactor;
    private String surveySubject;
    private String surveyCountry;
    private String surveyScholar;
    private String surveyENT;

    @Override
    public String toString() {
        return "SurveyRequest{" +
                "surveyPath='" + surveyPath + '\'' +
                ", surveyFactor='" + surveyFactor + '\'' +
                ", surveySubject='" + surveySubject + '\'' +
                ", surveyCountry='" + surveyCountry + '\'' +
                ", surveyScholar='" + surveyScholar + '\'' +
                ", surveyENT='" + surveyENT + '\'' +
                '}';
    }

   /* public List<Character> toList() {
        List<Character> AnswersStorage = new ArrayList<>();
        AnswersStorage.add(q1);
        AnswersStorage.add(q2);
        AnswersStorage.add(q3);
        AnswersStorage.add(q4);
        AnswersStorage.add(q5);
        AnswersStorage.add(q6);
        AnswersStorage.add(q7);
        AnswersStorage.add(q8);
        AnswersStorage.add(q9);
        AnswersStorage.add(q10);
        AnswersStorage.add(q11);
        AnswersStorage.add(q12);
        return AnswersStorage;
    }*/

    public SurveyRequest() {
        currentUsername = null;
        surveyPath = null;
        surveyFactor = null;
        surveySubject = null;
        surveyCountry = null;
        surveyScholar = null;
        surveyENT = null;
    }
}
