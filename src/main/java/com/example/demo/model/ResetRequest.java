package com.example.demo.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
