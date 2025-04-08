package com.amigoscode.oop.interfaces;

public class Main {



    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();

        Vehicle[] vehicles = {car,bicycle,electricScooter};

        Person person = new Person("Tahir",vehicles);

        for(Vehicle v : person.getVehicle()){
            v.getCurrentSpeed();
            v.move(5);
        }
    }



}
