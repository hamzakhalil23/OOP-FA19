package com.company;
public class Triangle2 implements Shape2{
    private int base;
    private int height;

    Triangle2(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
