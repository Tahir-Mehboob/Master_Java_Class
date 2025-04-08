package com.amigoscode.dependencyinjection;

import com.amigoscode.organize_the_code.car.Car;

public class Main {

    public static void main(String[] args) {

        //dependencies
         CarDao car = new CarDao();
         EmailService emailService = new EmailService();
         MOTService motService =  new MOTService(emailService);

         //injections
        CarService carService = new CarService(car,emailService,motService);

        // note how to optimize above code by using spring boot @Bean
        // or singleton pattern which bean by default fellow

        
    }

}
