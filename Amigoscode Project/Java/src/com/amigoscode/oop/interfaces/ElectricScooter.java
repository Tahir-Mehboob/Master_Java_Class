package com.amigoscode.oop.interfaces;

public class ElectricScooter implements Vehicle{

    private int currentSpeed;

    // constructor
    public ElectricScooter() {}

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


    @Override
    public void move(int amount) {
        System.out.println("Hop and press the Button");
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
