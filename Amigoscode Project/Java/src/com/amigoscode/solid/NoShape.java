package com.amigoscode.solid;

public class NoShape implements Shape {

    @Override
    public double area() {
        //throw new IllegalStateException("Cannot calculate area of no shape.");
        return 0 ;
    }

    @Override
    public double volume() {
        return 0;
    }
}
