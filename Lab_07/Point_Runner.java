package com.company;
public class Point_Runner {
    public static void main(String[] args) {
        Point p1 = new Point(50,40);
        Point p2 = new Point(15,10);
        Line l1 = new Line(p1,p2);
        System.out.println("length of line 1 = " + l1.getLength());

        Point p3 = new Point();
        p3.setXcord(10);
        p3.setYcord(5);
        Line l2 = new Line(p2,p3);
        System.out.println("length of line 2 = " + l2.getLength());
    }
}