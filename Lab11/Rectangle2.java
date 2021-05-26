package com.company;
public class Rectangle2 implements Shape2{
    private int length;
    private int width;

    Rectangle2(int length,int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
}
