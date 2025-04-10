package com.amigoscode.solid;

import java.util.List;

public class ShapesPrinter {

     /*public String json(int sum){
         return "{Sum in JSON : %s}".formatted(areaCalculator.sum());
     }

     public String csv(int sum){
         return "Sum in CSV , %s".formatted(sum);
     }*/

     // Breaking the rule Open and closed
     // by adding new Area calculation in printing classs

     // concrete class tightly couple
    // break the Dependency Invertion rule by using concrete class instead of using abstraction class
   /*  private AreaCalculator areaCalculator = new AreaCalculator();

     public String json(List<Shape> shapes) {
         return "{Sum in JSON : %s}".formatted(areaCalculator.sum(shapes));
     }

     public String csv(List<Shape> shapes){
         return "Sum in CSV , %s".formatted(shapes);
     }*/

    // How to achieve the 5 SOLID rule by apply abstraction or interface
    // and using Dependency Injection
    private  final IAreaCalculator areaCalculator;

    //passing above instance in parameter called Dependecy Injection
    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return "{Sum in JSON : %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "Sum in CSV , %s".formatted(areaCalculator.sum(shapes));
    }

}

