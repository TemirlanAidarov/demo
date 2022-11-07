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
public class UserAnswers {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @Column
    private String currentUsername;
    @Column
    private Character q1;
    @Column
    private Character q2;
    @Column
    private Character q3;
    @Column
    private Character q4;
    @Column
    private Character q5;
    @Column
    private Character q6;
    @Column
    private Character q7;
    @Column
    private Character q8;
    @Column
    private Character q9;
    @Column
    private Character q10;
    @Column
    private Character q11;
    @Column
    private Character q12;

    //@ManyToOne
    //@JoinColumn(
    //        nullable = false,
    //        name = "app_user_id"
    //)
    //private AppUser appUser;

    public UserAnswers(String currentUsername, Character q1, Character q2, Character q3,
                       Character q4, Character q5, Character q6,
                       Character q7, Character q8, Character q9,
                       Character q10, Character q11, Character q12) {
        this.currentUsername = currentUsername;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.q6 = q6;
        this.q7 = q7;
        this.q8 = q8;
        this.q9 = q9;
        this.q10 = q10;
        this.q11 = q11;
        this.q12 = q12;
        //this.appUser = appUser;
    }

    public UserAnswers() {

    }
}
