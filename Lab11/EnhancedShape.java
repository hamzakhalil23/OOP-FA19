package com.company;
public class EnhancedShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(6, 8 );
        System.out.println("Perimeter of Circle: " + circle.perimeter());
        System.out.println("Perimeter of triangle: " + triangle.perimeter());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
    }
}
