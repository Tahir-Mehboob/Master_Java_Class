package com.amigoscode.solid;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public class AreaCalculator {

    /*public int sum(List<Object> shapes) {
        int sum = 0;
        for (Object shape : shapes) {
            sum += (Integer) shape;
        }
        return sum;
    }*/

    public int sum(List<Object> shapes) {

        int sum = 0;
        for(int i = 0; i < shapes.size(); i++){

            Object shape = shapes.get(i);

            if(shape instanceof Square){
                sum += Math.pow( ((Square) shape).getLength(),2);
            }

            if(shape instanceof Circle){
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(),2);
            }
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
