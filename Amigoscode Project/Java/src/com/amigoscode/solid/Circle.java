package com.amigoscode.solid;

public class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    // press ALt+Enter
    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(),2);
    }

    /**
     * break the Rule b/c circle can't calculate the volume
     * @Tahir Mehboob
     * @return
     */
    @Override
    public double volume() {
        return 0;
    }
}
