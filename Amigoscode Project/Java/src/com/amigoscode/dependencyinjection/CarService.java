package com.amigoscode.dependencyinjection;

import com.amigoscode.organize_the_code.car.Car;

//@Component  // by using for class instantiate by spring boot and follow singletion pattern
public class CarService {

    // dependecies
    private CarDao carDao;
    private EmailService emailService;
    private MOTService motService;

    //needs
    // @Autowired / @Inject 
    public CarService(CarDao carDao, EmailService emailService, MOTService motService) {
        this.carDao = carDao;
        this.emailService = emailService;
        this.motService = motService;
    }
}
