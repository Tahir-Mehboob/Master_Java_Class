package com.amigoscode.solid;

public interface Shape {

    double area();

    //Rule number 4 Interface Segregation (interface should not force classes to implement what they can't do

    // volume calcualte only 3D object not for 2D objects

    double volume();


}
