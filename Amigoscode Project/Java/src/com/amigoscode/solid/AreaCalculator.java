package com.amigoscode.solid;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public class AreaCalculator implements IAreaCalculator {

    /*public int sum(List<Object> shapes) {
        int sum = 0;
        for (Object shape : shapes) {
            sum += (Integer) shape;
        }
        return sum;
    }*/

    @Override
    public int sum(List<Shape> shapes) {

        int sum = 0;
        for(int i = 0; i < shapes.size(); i++){

            // how to inline in a single line ctrl+alt+n
/*            Shape shape = shapes.get(i);
                sum += shape.area();*/

            sum +=shapes.get(i).area();

            /**
             * Apply O - Open/Closed Principle (OCP)
             * by commenting out below code
             * @Tahir Mehboob
             */

           /* if(shape instanceof Square){
                sum += Math.pow( ((Square) shape).getLength(),2);
            }

            if(shape instanceof Circle){
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(),2);
            }*/

            /**
             * O - Open/Closed Principle (OCP)
             * Break rule number 2 open and close principle
             * Extend behavior, don’t modify existing code.
             * Q How to reslove below issue when adding new shapes instead of rewriting code in existing class
             * use Interface Shape and all new Shapes implement to follow the above rule
             *
             * @Tahir Mehboob
             */

            /*if(shape instanceof Cube){
                sum += (6) *  Math.pow( ((Square) shape).getLength(),2)
            }*/

        }
        return sum;
    }

    // print the calculation
    // break Single Resp rule b/c one class for only one job
    // how to reslove using separate class for printing the calcualtion

    /*public String json(List<Object> shapes){
        return "{Sum : %s}".formatted(sum(shapes));
    }*/
}
