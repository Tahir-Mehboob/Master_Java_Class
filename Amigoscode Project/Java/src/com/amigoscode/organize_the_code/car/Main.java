package com.amigoscode.organize_the_code.car;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(
                CarBrand.Honda,
                BigDecimal.TEN
        );

        CarService carService = new CarService();
        carService.registerNewCar(car);

        System.out.println( carService.getCars());

    }
}
