package com.amigoscode.dependencyinjection;

import com.amigoscode.organize_the_code.car.Car;

public class CarService {

    // dependecies
    private CarDao carDao;
    private EmailService emailService;
    private MOTService motService;

    //needs
    public CarService(CarDao carDao, EmailService emailService, MOTService motService) {
        this.carDao = carDao;
        this.emailService = emailService;
        this.motService = motService;
    }
}
