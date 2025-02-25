package com.amigoscode.classesandobjects;

import com.amigoscode.organize_the_code.car.Car;
import com.amigoscode.organize_the_code.car.CarBrand;
import com.amigoscode.organize_the_code.person.Address;
import com.amigoscode.organize_the_code.person.Gender;
import com.amigoscode.organize_the_code.person.Person;

import java.math.BigDecimal;

public class Main {

    static {
        System.out.println("main static block");
    }

    public static void main(String[] args) {

        Address address = new Address(
          "FooBar 123",
          "PBR150",
          "Pakistan"
        );

        Car audiCar = new Car(
                CarBrand.Audi,
                new BigDecimal("65000")
        );

        Car bmwCar = new Car(
                CarBrand.BMW,
                new BigDecimal("90000")
        );

        Car cars[] = {audiCar,bmwCar};

        Person tahir = new Person(
                "Tahir",
                "Mehboob",
                address,
                28,
                cars,
                Gender.MALE
        );
        System.out.println(tahir);

        new Person();
    }
}
