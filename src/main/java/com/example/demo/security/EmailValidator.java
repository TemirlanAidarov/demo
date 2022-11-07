package com.example.demo.security;

import org.springframework.stereotype.Service;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.function.Predicate;


@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
        boolean isValid = false;
        try {
            InternetAddress internetAddress = new InternetAddress(s);
            internetAddress.validate();
            isValid = true;
        } catch (AddressException e) {
            System.out.println("You are in catch block -- Exception Occurred for: " + s);
        }
        return isValid;
    }
}
