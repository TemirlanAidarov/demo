package com.example.demo.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@EqualsAndHashCode
public class RegistrationRequest {

    private Long IIN;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String middlename;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
    private boolean gender;
    private String region;
    private String city;
    private String address;
    private int school;
    private int grade;

    public RegistrationRequest() {
        IIN = null;
        password = null;
        firstName = null;
        email = null;
        lastName = null;
        middlename = null;
        birthdate = null;
        gender = false;
        region = null;
        city = null;
        address = null;
        school = 0;
        grade = 0;
    }

    @Override
    public String toString() {
        return "RegistrationRequest{" +
                "IIN=" + IIN +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middlename='" + middlename + '\'' +
                ", birthdate=" + birthdate +
                ", gender=" + gender +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", school=" + school +
                ", grade=" + grade +
                '}';
    }
}
