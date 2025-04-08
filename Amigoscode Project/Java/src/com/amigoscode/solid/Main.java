package com.amigoscode.solid;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // initailize the objects
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(5);

        // printing calculation in separate class
        // follow Single Responsibility Rule
        ShapesPrinter   sp = new ShapesPrinter();

        List<Object> shapes = List.of(circle, square);
        int sum  = areaCalculator.sum(shapes);

        System.out.println(sp.json(sum));
        System.out.println(sp.csv(sum));

    }
}
