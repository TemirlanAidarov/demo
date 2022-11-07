package com.example.demo.service;

import com.example.demo.entity.SurveyAnswers;
import com.example.demo.entity.UserAnswersResult;
import com.example.demo.model.SurveyRequest;
import com.example.demo.model.TestRequest;
import com.example.demo.repo.UserAnswersResultRepo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class WebService {
    private final AppUserService appUserService;
    private final UserAnswersResultRepo userAnswersResultRepo;

    public WebService(AppUserService appUserService,
                      UserAnswersResultRepo userAnswersResultRepo) {
        this.appUserService = appUserService;
        this.userAnswersResultRepo = userAnswersResultRepo;
    }

    public void saveQuestions(TestRequest testRequest) {

        /*appUserService.saveUserAnswers(
                new UserAnswers(
                        testRequest.getCurrentUsername(),
                        testRequest.getQ1(),
                        testRequest.getQ2(),
                        testRequest.getQ3(),
                        testRequest.getQ4(),
                        testRequest.getQ5(),
                        testRequest.getQ6(),
                        testRequest.getQ7(),
                        testRequest.getQ8(),
                        testRequest.getQ9(),
                        testRequest.getQ10(),
                        testRequest.getQ11(),
                        testRequest.getQ12()
                        )
        );*/
    }

    public void evaluateAnswers(TestRequest testRequest) {
        HashMap<String, String> KeyMap = new HashMap<>();

        KeyMap.put("5A", "Физико-математическое направление");
        KeyMap.put("18B", "Физико-математическое направление");
        KeyMap.put("31B", "Физико-математическое направление");
        KeyMap.put("40A", "Физико-математическое направление");
        KeyMap.put("42A", "Физико-математическое направление");
        KeyMap.put("46A", "Физико-математическое направление");
        KeyMap.put("48A", "Физико-математическое направление");
        KeyMap.put("49в", "Физико-математическое направление");
        KeyMap.put("58A", "Физико-математическое направление");
        KeyMap.put("67A", "Физико-математическое направление");
        KeyMap.put("82A", "Физико-математическое направление");
        KeyMap.put("86A", "Физико-математическое направление");
        KeyMap.put("107A", "Физико-математическое направление");
        KeyMap.put("112B", "Физико-математическое направление");

        KeyMap.put("1A", "Химико-биологическое направление");
        KeyMap.put("3A", "Химико-биологическое направление");
        KeyMap.put("4A", "Химико-биологическое направление");
        KeyMap.put("5A", "Химико-биологическое направление");
        KeyMap.put("7A", "Химико-биологическое направление");
        KeyMap.put("14A", "Химико-биологическое направление");
        KeyMap.put("22A", "Химико-биологическое направление");
        KeyMap.put("34B", "Химико-биологическое направление");
        KeyMap.put("65G", "Химико-биологическое направление");
        KeyMap.put("86E", "Химико-биологическое направление");
        KeyMap.put("108A", "Химико-биологическое направление");
        KeyMap.put("119A", "Химико-биологическое направление");

        KeyMap.put("20B", "Лингвистическое направление");
        KeyMap.put("26A", "Лингвистическое направление");
        KeyMap.put("32A", "Лингвистическое направление");
        KeyMap.put("36A", "Лингвистическое направление");
        KeyMap.put("49G", "Лингвистическое направление");
        KeyMap.put("57A", "Лингвистическое направление");
        KeyMap.put("65B", "Лингвистическое направление");
        KeyMap.put("86B", "Лингвистическое направление");
        KeyMap.put("86J", "Лингвистическое направление");
        KeyMap.put("95A", "Лингвистическое направление");
        KeyMap.put("109A", "Лингвистическое направление");
        KeyMap.put("110J", "Лингвистическое направление");
        KeyMap.put("112V", "Лингвистическое направление");
        KeyMap.put("113A", "Лингвистическое направление");
        KeyMap.put("114B", "Лингвистическое направление");
        KeyMap.put("119V", "Лингвистическое направление");

        KeyMap.put("6A", "Техническое направление");
        KeyMap.put("8A", "Техническое направление");
        KeyMap.put("9A", "Техническое направление");
        KeyMap.put("12A", "Техническое направление");
        KeyMap.put("13A", "Техническое направление");
        KeyMap.put("17A", "Техническое направление");
        KeyMap.put("21B", "Техническое направление");
        KeyMap.put("34G", "Техническое направление");
        KeyMap.put("73B", "Техническое направление");
        KeyMap.put("110D", "Техническое направление");
        KeyMap.put("111A", "Техническое направление");
        KeyMap.put("113B", "Техническое направление");
        KeyMap.put("119B", "Техническое направление");

        KeyMap.put("5A", "Информационные технологии");
        KeyMap.put("17A", "Информационные технологии");
        KeyMap.put("39A", "Информационные технологии");
        KeyMap.put("49A", "Информационные технологии");
        KeyMap.put("51A", "Информационные технологии");
        KeyMap.put("53A", "Информационные технологии");
        KeyMap.put("86G", "Информационные технологии");
        KeyMap.put("110A", "Информационные технологии");
        KeyMap.put("114A", "Информационные технологии");
        KeyMap.put("115A", "Информационные технологии");

        KeyMap.put("10A", "Спортивное направление и военное дело");
        KeyMap.put("33A", "Спортивное направление и военное дело");
        KeyMap.put("34A", "Спортивное направление и военное дело");
        KeyMap.put("35A", "Спортивное направление и военное дело");
        KeyMap.put("43A", "Спортивное направление и военное дело");
        KeyMap.put("44A", "Спортивное направление и военное дело");
        KeyMap.put("49B", "Спортивное направление и военное дело");
        KeyMap.put("86D", "Спортивное направление и военное дело");
        KeyMap.put("87A", "Спортивное направление и военное дело");
        KeyMap.put("89A", "Спортивное направление и военное дело");
        KeyMap.put("90A", "Спортивное направление и военное дело");
        KeyMap.put("93A", "Спортивное направление и военное дело");
        KeyMap.put("110G", "Спортивное направление и военное дело");

        KeyMap.put("11A", "Художественно-эстетическое направление");
        KeyMap.put("23A", "Художественно-эстетическое направление");
        KeyMap.put("24A", "Художественно-эстетическое направление");
        KeyMap.put("31V", "Художественно-эстетическое направление");
        KeyMap.put("34V", "Художественно-эстетическое направление");
        KeyMap.put("34D", "Художественно-эстетическое направление");
        KeyMap.put("49A", "Художественно-эстетическое направление");
        KeyMap.put("57B", "Художественно-эстетическое направление");
        KeyMap.put("57V", "Художественно-эстетическое направление");
        KeyMap.put("73V", "Художественно-эстетическое направление");
        KeyMap.put("110E", "Художественно-эстетическое направление");
        KeyMap.put("111B", "Художественно-эстетическое направление");
        KeyMap.put("113A", "Художественно-эстетическое направление");
        KeyMap.put("115V", "Художественно-эстетическое направление");

        KeyMap.put("15A", "Экономика и маркетинг");
        KeyMap.put("45A", "Экономика и маркетинг");
        KeyMap.put("65V", "Экономика и маркетинг");
        KeyMap.put("71A", "Экономика и маркетинг");
        KeyMap.put("76A", "Экономика и маркетинг");
        KeyMap.put("83A", "Экономика и маркетинг");
        KeyMap.put("84V", "Экономика и маркетинг");
        KeyMap.put("85A", "Экономика и маркетинг");
        KeyMap.put("91A", "Экономика и маркетинг");
        KeyMap.put("106A", "Экономика и маркетинг");
        KeyMap.put("114V", "Экономика и маркетинг");
        KeyMap.put("115B", "Экономика и маркетинг");

        KeyMap.put("29A", "Психолого-педагогическое направление");
        KeyMap.put("34E", "Психолого-педагогическое направление");
        KeyMap.put("65A", "Психолого-педагогическое направление");
        KeyMap.put("75A", "Психолого-педагогическое направление");
        KeyMap.put("77A", "Психолого-педагогическое направление");
        KeyMap.put("101A", "Психолого-педагогическое направление");
        KeyMap.put("110B", "Психолого-педагогическое направление");
        KeyMap.put("115G", "Психолого-педагогическое направление");

        KeyMap.put("11A", "Социально-историческое направление");
        KeyMap.put("27A", "Социально-историческое направление");
        KeyMap.put("28A", "Социально-историческое направление");
        KeyMap.put("31A", "Социально-историческое направление");
        KeyMap.put("47A", "Социально-историческое направление");
        KeyMap.put("103A", "Социально-историческое направление");
        KeyMap.put("104A", "Социально-историческое направление");
        KeyMap.put("111V", "Социально-историческое направление");

        KeyMap.put("55A", "Сфера услуг и производство");
        KeyMap.put("59A", "Сфера услуг и производство");
        KeyMap.put("62A", "Сфера услуг и производство");
        KeyMap.put("69A", "Сфера услуг и производство");
        KeyMap.put("74A", "Сфера услуг и производство");
        KeyMap.put("79A", "Сфера услуг и производство");
        KeyMap.put("86V", "Сфера услуг и производство");
        KeyMap.put("92A", "Сфера услуг и производство");
        KeyMap.put("96A", "Сфера услуг и производство");
        KeyMap.put("110V", "Сфера услуг и производство");
        KeyMap.put("16A", "Сфера услуг и производство");
        KeyMap.put("21A", "Сфера услуг и производство");
        KeyMap.put("114G", "Сфера услуг и производство");

        //личные качества
        KeyMap.put("19B", "Лидерство");
        KeyMap.put("38A", "Лидерство");
        KeyMap.put("57G", "Лидерство");
        KeyMap.put("80A", "Лидерство");
        KeyMap.put("84A", "Лидерство");
        KeyMap.put("98B", "Лидерство");
        KeyMap.put("116V", "Лидерство");
        KeyMap.put("117G", "Лидерство");
        KeyMap.put("118A", "Лидерство");

        KeyMap.put("25A", "Логика");
        KeyMap.put("27A", "Логика");
        KeyMap.put("37A", "Логика");
        KeyMap.put("52A", "Логика");
        KeyMap.put("54A", "Логика");
        KeyMap.put("99A", "Логика");
        KeyMap.put("113V", "Логика");
        KeyMap.put("117A", "Логика");

        KeyMap.put("30A", "Креативность");
        KeyMap.put("56A", "Креативность");
        KeyMap.put("63A", "Креативность");
        KeyMap.put("64A", "Креативность");
        KeyMap.put("66A", "Креативность");
        KeyMap.put("68A", "Креативность");
        KeyMap.put("73A", "Креативность");
        KeyMap.put("98A", "Креативность");
        KeyMap.put("99B", "Креативность");
        KeyMap.put("116B", "Креативность");
        KeyMap.put("117V", "Креативность");
        KeyMap.put("118B", "Креативность");
        KeyMap.put("120B", "Креативность");

        KeyMap.put("41A", "Организованность");
        KeyMap.put("61A", "Организованность");
        KeyMap.put("70A", "Организованность");
        KeyMap.put("84B", "Организованность");
        KeyMap.put("116A", "Организованность");
        KeyMap.put("117B", "Организованность");
        KeyMap.put("118V", "Организованность");
        KeyMap.put("120V", "Организованность");

        KeyMap.put("60A", "Социальный интеллект");
        KeyMap.put("72A", "Социальный интеллект");
        KeyMap.put("78A", "Социальный интеллект");
        KeyMap.put("81A", "Социальный интеллект");
        KeyMap.put("94A", "Социальный интеллект");
        KeyMap.put("97A", "Социальный интеллект");
        KeyMap.put("99V", "Социальный интеллект");
        KeyMap.put("102B", "Социальный интеллект");
        KeyMap.put("120A", "Социальный интеллект");

        //Шкалы ведущего мотива деятельности.
        KeyMap.put("2A", "Мотивация избегания неудач");
        KeyMap.put("100A", "Мотивация избегания неудач");
        KeyMap.put("105A", "Мотивация избегания неудач");

        KeyMap.put("2B", "Мотивация достижения успеха");
        KeyMap.put("100B", "Мотивация достижения успеха");
        KeyMap.put("105B", "Мотивация достижения успеха");

        /*KeyMap.put("1B", "Биология");
        KeyMap.put("1A", "Химия");
        KeyMap.put("2A", "Мотивация избегания неудач");
        KeyMap.put("2B", "Мотивация достижения успеха");
        KeyMap.put("3A", "Химия");
        KeyMap.put("4A", "Химия");
        KeyMap.put("5A", "Информационные технологии");
        KeyMap.put("6A", "Техническое направление");
        KeyMap.put("7A", "Химия");
        KeyMap.put("8A", "Техническое направление");
        KeyMap.put("9A", "Техническое направление");
        KeyMap.put("10A", "Спортивное направление и военное дело");
        KeyMap.put("11A", "Художественно-эстетическое направление");
        KeyMap.put("12A", "Техническое направление");
        */
        int physMat = 0;
        int chemBio = 0;
        int ling = 0;
        int tech = 0;
        int it = 0;
        int sport = 0;
        int art = 0;
        int econ = 0;
        int psych = 0;
        int soc = 0;
        int service = 0;
        //
        int leader = 0;
        int logic = 0;
        int creativity = 0;
        int organized = 0;
        int socialInt = 0;
        int motiv = 0;
        int antiMotiv = 0;

        List<Character> AnswersStorage = testRequest.toList();
        System.out.println("AnswersStorage: " + AnswersStorage);
        for (int number = 0; number < AnswersStorage.size(); number++) {
            String toConcat = String.valueOf(AnswersStorage.get(number));
            System.out.println("toConcat: " + toConcat);
            String stringToUse = ((number + 1) + "" + toConcat);
            System.out.println(stringToUse);

            String subject = KeyMap.get(stringToUse);
            System.out.println(subject);
            if (subject == null) continue;

            switch (subject) {
                case "Физико-математическое направление" -> {
                    physMat++;
                    break;
                }
                case "Химико-биологическое направление" -> {
                    chemBio++;
                    break;
                }
                case "Лингвистическое направление" -> {
                    ling++;
                    break;
                }
                case "Техническое направление" -> {
                    tech++;
                    break;
                }
                case "Информационные технологии" -> {
                    it++;
                    break;
                }
                case "Спортивное направление и военное дело" -> {
                    sport++;
                    break;
                }
                case "Художественно-эстетическое направление" -> {
                    art++;
                    break;
                }
                case "Экономика и маркетинг" -> {
                    econ++;
                    break;
                }
                case "Психолого-педагогическое направление" -> {
                    psych++;
                    break;
                }
                case "Социально-историческое направление" -> {
                    soc++;
                    break;
                }
                case "Сфера услуг и производство" -> {
                    service++;
                    break;
                }
                case "Лидерство" -> {
                    leader++;
                    break;
                }
                case "Логика" -> {
                    logic++;
                    break;
                }
                case "Креативность" -> {
                    creativity++;
                    break;
                }
                case "Организованность" -> {
                    organized++;
                    break;
                }
                case "Социальный интеллект" -> {
                    socialInt++;
                    break;
                }
                case "Мотивация избегания неудач" -> {
                    antiMotiv++;
                    break;
                }
                case "Мотивация достижения успеха" -> {
                    motiv++;
                    break;
                }
                default -> System.out.println("didn't matched");
            }
            //System.out.println("end");
        }

        System.out.println("Физико-математическое направление: " + physMat);
        System.out.println("Химико-биологическое направление: " + chemBio);
        System.out.println("Лингвистическое направление: " + ling);
        System.out.println("Техническое направление: " + tech);
        System.out.println("Информационные технологии: " + it);
        System.out.println("Спортивное направление и военное дело: " + sport);
        System.out.println("Художественно-эстетическое направление: " + art);
        System.out.println("Экономика и маркетинг: " + econ);
        System.out.println("Психолого-педагогическое направление: " + psych);
        System.out.println("Социально-историческое направление: " + soc);
        System.out.println("Сфера услуг и производство: " + service);
        System.out.println("Лидерство: " + leader);
        System.out.println("Логика: " + logic);
        System.out.println("Креативность: " + creativity);
        System.out.println("Организованность: " + organized);
        System.out.println("Социальный интеллект: " + socialInt);
        System.out.println("Мотивация избегания неудач: " + antiMotiv);
        System.out.println("Мотивация достижения успеха: " + motiv);


        int physMatPer = calculatePercentage(physMat, 14);
        int chemBioPer = calculatePercentage(chemBio, 12);
        int lingPer = calculatePercentage(ling, 16);
        int techPer = calculatePercentage(tech, 13);
        int itPer = calculatePercentage(it, 10);
        int sportPer = calculatePercentage(sport, 13);
        int artPer = calculatePercentage(art, 14);
        int econPer = calculatePercentage(econ, 12);
        int psychPer = calculatePercentage(psych, 8);
        int socPer = calculatePercentage(soc, 8);
        int servicePer = calculatePercentage(service, 14);
        //
        int leaderPer = calculatePercentage(leader, 9);
        int logicPer = calculatePercentage(logic, 8);
        int creativityPer = calculatePercentage(creativity, 13);
        int organizedPer = calculatePercentage(organized, 8);
        int socialIntPer = calculatePercentage(socialInt, 9);
        int antiMotivPer = calculatePercentage(antiMotiv, 3);
        int motivPer = calculatePercentage(motiv, 3);


        System.out.println("Физико-математическое направление: " + physMatPer);
        System.out.println("Химико-биологическое направление: " + chemBioPer);
        System.out.println("Лингвистическое направление: " + lingPer);
        System.out.println("Техническое направление: " + techPer);
        System.out.println("Информационные технологии: " + itPer);
        System.out.println("Спортивное направление и военное дело: " + sportPer);
        System.out.println("Художественно-эстетическое направление: " + artPer);
        System.out.println("Экономика и маркетинг: " + econPer);
        System.out.println("Психолого-педагогическое направление: " + psychPer);
        System.out.println("Социально-историческое направление: " + socPer);
        System.out.println("Сфера услуг и производство: " + servicePer);
        System.out.println("Лидерство: " + leaderPer);
        System.out.println("Логика: " + logicPer);
        System.out.println("Креативность: " + creativityPer);
        System.out.println("Организованность: " + organizedPer);
        System.out.println("Социальный интеллект: " + socialIntPer);
        System.out.println("Мотивация избегания неудач: " + antiMotivPer);
        System.out.println("Мотивация достижения успеха: " + motivPer);

        appUserService.saveUserResultsAnswers(
                new UserAnswersResult(
                        testRequest.getCurrentUsername(),
                        physMatPer,
                        chemBioPer,
                        lingPer,
                        techPer,
                        itPer,
                        sportPer,
                        artPer,
                        econPer,
                        psychPer,
                        socPer,
                        servicePer,
                        leaderPer,
                        logicPer,
                        creativityPer,
                        organizedPer,
                        socialIntPer,
                        antiMotivPer,
                        motivPer
                )
        );

    }

    public int calculatePercentage(int obtained, int total) {
        double obtainedD = Double.valueOf(obtained);
        double totalD = Double.valueOf(total);
        double percent = obtained * 100 / total;
        return (int) percent;
    }


    public UserAnswersResult getResultMethod(String currentUserName) {
        UserAnswersResult result = userAnswersResultRepo.findByCurrentUsername(currentUserName);
        //System.out.println(result);

        return result;
    }

    public void saveSurvey(SurveyRequest surveyRequest) {

        appUserService.saveSurveyAnswers(
                new SurveyAnswers(
                        surveyRequest.getCurrentUsername(),
                        surveyRequest.getSurveyPath(),
                        surveyRequest.getSurveyFactor(),
                        surveyRequest.getSurveySubject(),
                        surveyRequest.getSurveyCountry(),
                        surveyRequest.getSurveyScholar(),
                        surveyRequest.getSurveyENT()
                )
        );
    }

}
