package com.amigoscode.dependencyinjection;

public class MOTService {

    // Dependencies
    private EmailService emailService;

    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }

}
