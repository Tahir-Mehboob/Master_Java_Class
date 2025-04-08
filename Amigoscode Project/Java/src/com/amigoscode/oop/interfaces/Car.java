package com.amigoscode.oop.interfaces;

public class Car implements Vehicle{

    private int currentSpeed;

    // constructor
    public Car() {}

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("Engine Start");
        System.out.println("Acceleration: the speed " );
        this.currentSpeed += amount;
    }

    @Override
    public void applyBrakes(int amount) {
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
