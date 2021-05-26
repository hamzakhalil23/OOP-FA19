package com.company;
public class Triangle implements Shape{
    private int base;
    private int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double perimeter() {
        return 0.5 * base * height;
    }
}
