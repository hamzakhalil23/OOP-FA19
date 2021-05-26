package com.company;
public class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double perimeter() {
        return 3.14 * 2 * radius;
    }
}
