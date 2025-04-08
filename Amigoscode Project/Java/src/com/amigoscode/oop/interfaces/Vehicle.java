package com.amigoscode.oop.interfaces;

public interface Vehicle {

    // Constant

    // Abstract Methods
    void move(int amount);

    void applyBrakes(int amount);

    int getCurrentSpeed();

    // default  Methods

    default double milesToKm(){
        return getCurrentSpeed()/1000.0;
    }

}
