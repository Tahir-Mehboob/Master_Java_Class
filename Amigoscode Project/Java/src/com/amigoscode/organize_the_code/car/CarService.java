package com.amigoscode.organize_the_code.car;

public class CarService {

    // conntecting two service and dao class

    // by creating objects

    private CarDao carDao;

    public CarService() {
        this.carDao = new CarDao();
    }

    public int registerNewCar(Car car) {

        //if car is not null
        // check if reg no is valid
        //check if reg number is valid
        //check if reg  num
        // check if reg no is not taken
        // check if price is < than 0

     carDao.saveCar(car);
        return 1;
    }

    public Car[] getCars() {
       return carDao.getAllCars();
    }
}
