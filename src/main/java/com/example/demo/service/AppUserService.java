package com.example.demo.service;

import com.example.demo.entity.SurveyAnswers;
import com.example.demo.entity.UserAnswersResult;
import com.example.demo.repo.AppUserRepo;
import com.example.demo.repo.SurveyAnswersRepo;
import com.example.demo.repo.UserAnswersRepo;
import com.example.demo.repo.UserAnswersResultRepo;
import com.example.demo.entity.AppUser;
import com.example.demo.entity.UserAnswers;
import com.example.demo.security.EmailSenderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService {
    @Autowired
    private EmailSenderService emailSenderService;
    private final static String EMAIL_NOT_FOUND_MSG =
            "user with email %s not found";

    private final static String IIN_NOT_FOUND_MSG =
            "user with IIN %s not found";
    private final AppUserRepo appUserRepo;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return appUserRepo.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format(EMAIL_NOT_FOUND_MSG, email)));
    }

    /*public Boolean authenticateUser(String requestEmail, String requestPassword){
        System.out.println("Inside authenticateUser");
        boolean userExists = appUserRepo
                .findByEmail(requestEmail)
                .isPresent();

        System.out.println("userExists: " + userExists);
        if (!userExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            return false;
        }
        boolean passwordCorrect = appUserRepo
                .findByEmailAndPassword(requestEmail, requestPassword)
                .isPresent();
        System.out.println("passwordCorrect: " + passwordCorrect);
        if (!passwordCorrect) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            return false;
        }
        return true;
    }*/

    public void signUpUser(AppUser appUser) {
        boolean userExists = appUserRepo
                .findByEmail(appUser.getEmail())
                .isPresent();

        if (userExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            throw new IllegalStateException("email already taken");
        }

        boolean IINExists = appUserRepo
                .findByIIN(appUser.getIIN())
                .isPresent();

        if (IINExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            throw new IllegalStateException("IIN already taken");
        }

        //-------Password encryption-------
        String passwordNew = UUID.randomUUID().toString();
        String encodedPassword = bCryptPasswordEncoder
                .encode(passwordNew);
        appUser.setPassword(encodedPassword);
        appUserRepo.save(appUser);

        //String token = UUID.randomUUID().toString();
        //ConfirmationToken confirmationToken = new ConfirmationToken(
        //        token,
        //        LocalDateTime.now(),
        //        //LocalDateTime.now().plusMinutes(15),
        //        appUser
        //);

        //confirmationTokenService.saveConfirmationToken(
        //        confirmationToken);

//        TODO: SEND EMAIL
        String emailToEmail = appUser.getEmail();
        emailSenderService.sendEmail(emailToEmail,
                "Ваш сгенерированный пароль для входа",
                passwordNew);
        //return token;
    }

    private final UserAnswersRepo userAnswersRepo;
    private final UserAnswersResultRepo userAnswersResultRepo;

    public void saveUserAnswers(UserAnswers userAnswers) {
        String curUser = userAnswers.getCurrentUsername();
        UserAnswers toSave = userAnswersRepo.findByCurrentUsername(curUser);
        if(toSave!=null){
            toSave.setQ1(userAnswers.getQ1());
            toSave.setQ2(userAnswers.getQ2());
            toSave.setQ3(userAnswers.getQ3());
            toSave.setQ4(userAnswers.getQ4());
            toSave.setQ5(userAnswers.getQ5());
            toSave.setQ6(userAnswers.getQ6());
            toSave.setQ7(userAnswers.getQ7());
            toSave.setQ8(userAnswers.getQ8());
            toSave.setQ9(userAnswers.getQ9());
            toSave.setQ10(userAnswers.getQ10());
            toSave.setQ11(userAnswers.getQ11());
            toSave.setQ12(userAnswers.getQ12());

            System.out.println("IT EXISTS!!!");
            userAnswersRepo.save(toSave);
        }
        else{
            System.out.println("IT DOESN'T EXISTS!!!");
            userAnswersRepo.save(userAnswers);
        }
    }
    private final SurveyAnswersRepo surveyAnswersRepo;
    public void saveSurveyAnswers(SurveyAnswers surveyAnswers) {
        String curUser = surveyAnswers.getCurrentUsername();
        SurveyAnswers toSave = surveyAnswersRepo.findByCurrentUsername(curUser);
        if(toSave!=null){
            toSave.setSurveyCountry(surveyAnswers.getSurveyCountry());
            toSave.setSurveyENT(surveyAnswers.getSurveyENT());
            toSave.setSurveyFactor(surveyAnswers.getSurveyFactor());
            toSave.setSurveyScholar(surveyAnswers.getSurveyScholar());
            toSave.setSurveySubject(surveyAnswers.getSurveySubject());
            toSave.setSurveyPath(surveyAnswers.getSurveyPath());

            System.out.println("IT EXISTS!!!");
            surveyAnswersRepo.save(toSave);
        }
        else{
            System.out.println("IT DOESN'T EXISTS!!!");
            surveyAnswersRepo.save(surveyAnswers);
        }
    }
    public void saveUserResultsAnswers(UserAnswersResult userAnswersResult) {
        String curUser = userAnswersResult.getCurrentUsername();
        UserAnswersResult toSave = userAnswersResultRepo.findByCurrentUsername(curUser);
        if(toSave!=null){
            toSave.setPhysMat(userAnswersResult.getPhysMat());
            toSave.setChemBio(userAnswersResult.getChemBio());
            toSave.setLing(userAnswersResult.getLing());
            toSave.setTech(userAnswersResult.getTech());
            toSave.setIt(userAnswersResult.getIt());
            toSave.setSport(userAnswersResult.getSport());
            toSave.setArt(userAnswersResult.getArt());
            toSave.setPsych(userAnswersResult.getPsych());
            toSave.setEcon(userAnswersResult.getEcon());
            toSave.setSoc(userAnswersResult.getSoc());
            toSave.setService(userAnswersResult.getService());
        }
        else{
            System.out.println("IT DOESN'T EXISTS!!!");
            userAnswersResultRepo.save(userAnswersResult);
        }
    }

    public void sendResetEmail(String email) {
        boolean userExists = appUserRepo
                .findByEmail(email)
                .isPresent();
        System.out.println("inAppService");
        if (!userExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            throw new IllegalStateException("Given email was not registered");
        }

        Optional<AppUser> appUser = appUserRepo.findByEmail(email);

        try {
            String passwordNew = UUID.randomUUID().toString();
            String encodedPassword = bCryptPasswordEncoder
                    .encode(passwordNew);
            AppUser user = appUser.get();
            user.setPassword(encodedPassword);
            appUserRepo.save(user);
            emailSenderService.sendEmail(email,
                    "Ваш восстановленный пароль для входа",
                    passwordNew);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        //appUser.setPassword(encodedPassword);
        //appUserRepo.save(appUser);


    }


    //@EventListener(ApplicationReadyEvent.class)
    //public void triggerMail() throws MessagingException {
    //    emailSenderService.sendEmail("temirlan.aidarov@alumni.nu.edu.kz",
    //            "Hello Sender Message!",
    //            "Hello");

    //}

    //Enable
    //public int enableAppUser(String email) {
    //    return appUserRepo.enableAppUser(email);
    //}
}
