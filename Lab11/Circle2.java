package com.company;
public class Circle2 implements Shape2{
    private double radius;
    Circle2 (double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
