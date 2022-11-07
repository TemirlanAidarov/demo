package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@ToString
public class UserAnswersResult {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long rid;

    @Column
    private String currentUsername;
    @Column
    private int physMat;
    @Column
    private int chemBio;
    @Column
    private int ling;
    @Column
    private int tech;
    @Column
    private int it;
    @Column
    private int sport;
    @Column
    private int art;
    @Column
    private int econ;
    @Column
    private int psych;
    @Column
    private int soc;
    @Column
    private int service;
    @Column
    private int leader;
    @Column
    private int logic;
    @Column
    private int creativity;
    @Column
    private int organized;
    @Column
    private int socialInt;
    @Column
    private int antiMotiv;
    @Column
    private int motiv;

    //@ManyToOne
    //@JoinColumn(
    //        nullable = false,
    //        name = "app_user_id"
    //)
    //private AppUser appUser;


    public UserAnswersResult(String currentUsername, int physMat, int chemBio, int ling,
                             int tech, int it, int sport, int art, int econ, int psych,
                             int soc, int service, int leader, int logic, int creativity,
                             int organized, int socialInt, int antiMotiv, int motiv) {
        this.currentUsername = currentUsername;
        this.physMat = physMat;
        this.chemBio = chemBio;
        this.ling = ling;
        this.tech = tech;
        this.it = it;
        this.sport = sport;
        this.art = art;
        this.econ = econ;
        this.psych = psych;
        this.soc = soc;
        this.service = service;
        this.leader = leader;
        this.logic = logic;
        this.creativity = creativity;
        this.organized = organized;
        this.socialInt = socialInt;
        this.antiMotiv = antiMotiv;
        this.motiv = motiv;
    }

    public UserAnswersResult() {

    }
}
