package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class ResetRequest {
    private String email;

    public ResetRequest() {
        email = null;
    }

    @Override
    public String toString() {
        return "RegistrationRequest{" +
                ", email='" + email + '\'' +
                '}';
    }
}
