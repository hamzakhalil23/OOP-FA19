package com.company;
public class Rectangle implements Shape{
    private int length;
    private int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double perimeter() {
        return length * width;
    }
}
