package com.amigoscode.oop.interfaces;

public class Bicycle implements Vehicle{

    private int currentSpeed;

    // constructor
    public Bicycle() {}

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


    @Override
    public void move(int amount) {

        System.out.println("pedal");
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
