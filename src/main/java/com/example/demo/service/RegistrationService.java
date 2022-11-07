package com.example.demo.service;

import com.example.demo.entity.AppUser;
import com.example.demo.model.ResetRequest;
import com.example.demo.security.EmailValidator;
import com.example.demo.security.AppUserRole;
import com.example.demo.model.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public RegistrationService(AppUserService appUserService,
                               EmailValidator emailValidator) {
        this.appUserService = appUserService;
        this.emailValidator = emailValidator;
    }

    //private final ConfirmationTokenService confirmationTokenService;
    public void register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.
                test(request.getEmail());

        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }

        appUserService.signUpUser(
                new AppUser(
                        request.getIIN(),
                        request.getPassword(),
                        request.getEmail(),
                        request.getFirstName(),
                        request.getLastName(),
                        request.getMiddlename(),
                        request.getBirthdate(),
                        request.isGender(),
                        request.getRegion(),
                        request.getCity(),
                        request.getAddress(),
                        request.getSchool(),
                        request.getGrade(),
                        AppUserRole.USER
                )
        );

    }

    public void reset(ResetRequest resetRequest) {
        System.out.println("inside RegistrationService");
        boolean isValidEmail = emailValidator.
                test(resetRequest.getEmail());

        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }

        appUserService.sendResetEmail(resetRequest.getEmail());

    }

    /*@Transactional
    public String confirmToken(String token) {
        ConfirmationToken confirmationToken = confirmationTokenService
                .getToken(token)
                .orElseThrow(() ->
                        new IllegalStateException("token not found"));

        if (confirmationToken.getConfirmedAt() != null) {
            throw new IllegalStateException("email already confirmed");
        }

        //LocalDateTime expiredAt = confirmationToken.getExpiresAt();

        //if (expiredAt.isBefore(LocalDateTime.now())) {
        //    throw new IllegalStateException("token expired");
        //}

        confirmationTokenService.setConfirmedAt(token);
        appUserService.enableAppUser(
                confirmationToken.getAppUser().getEmail());
        return "confirmed";
    }*/
}
