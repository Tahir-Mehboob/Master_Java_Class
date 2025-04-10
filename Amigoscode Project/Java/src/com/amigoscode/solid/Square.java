package com.amigoscode.solid;

public class Square implements Shape {

    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }


    @Override
    public double area() {
        return  Math.pow(getLength(),2);
    }

    /**
     * Also break the rule b/c  square not  follow the rule to calculate the volume
     * b.c not 3D object and interface force to implement the volume method
     * @Tahir Mehboob
     * @return
     */
    @Override
    public double volume() {
        return 0;
    }

}
