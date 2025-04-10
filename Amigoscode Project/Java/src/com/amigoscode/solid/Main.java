package com.amigoscode.solid;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // initailize the objects
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(5);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();

        // Liskov Principle
        // derived class should be substituable for base class
        NoShape noShape = new NoShape();

        // printing calculation in separate class
        // follow Single Responsibility Rule
        ShapesPrinter   sp = new ShapesPrinter(areaCalculator);

        List<Shape> shapes = List.of(circle, square,cube,rectangle,noShape); ;
        int sum  = areaCalculator.sum(shapes);

        System.out.println(sp.json(shapes));
        System.out.println(sp.csv(shapes));

    }
}
