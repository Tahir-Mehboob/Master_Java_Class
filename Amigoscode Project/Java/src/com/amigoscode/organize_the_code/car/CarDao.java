package com.amigoscode.organize_the_code.car;

public class CarDao {

    private static Car cars[];
    private static int nextAvailableSlots=0;
    private static final int capacity = 10;

    static{
        System.out.println("Initializing CarDao static block");
        cars = new Car[capacity];
    }

    public void saveCar(Car car){
        if(nextAvailableSlots +1 >= capacity){

        }
        cars[nextAvailableSlots] = car;
        ++nextAvailableSlots;

    }

    public Car[] getAllCars(){
        return cars;
    }

}
