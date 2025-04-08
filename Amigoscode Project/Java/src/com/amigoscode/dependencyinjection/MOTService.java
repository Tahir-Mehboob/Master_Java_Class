package com.amigoscode.dependencyinjection;

//@Component  // by using for class instantiate by spring boot and follow singletion pattern
public class MOTService {

    // Dependencies
    private EmailService emailService;

    // needs for emailService
    //use @Inject / @Autowired
    // means first instantiate ES then inject
    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }

}
