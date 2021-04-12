package com.company;
public class Point {
    private double xcord;
    private double ycord;
    public Point(){
    }
    public Point(double x,double y){
        this.xcord = x;
        this.ycord = y;
    }
    public void setXcord(double x_cord) {
        this.xcord = xcord;
    }
    public void setYcord(double y_cord) {
        this.ycord = ycord;
    }
    public double getXcord() {
        return xcord;
    }
    public double getYcord() {
        return ycord;
    }
    public void display(){
        System.out.println("x-coordinate = " + xcord + "\ny-coordinate = " + ycord);
    }
}
