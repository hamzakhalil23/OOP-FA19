package com.company;
public class SimpleRunner {
    public static void main(String[] args) {
        Simple s = new Simple(9,10);
        System.out.println("Two numbers are: " + s.number1 + " , " + s.number2);
        System.out.println("Sum of two numbers = " + s.add());
        System.out.println("Difference between two numbers = " + s.subtract());
        System.out.println("Product of two numbers = " + s.multiply());
        System.out.println("Dividing number 1 by number 2, we get: " + s.divide());


        VerifiedSimple v = new VerifiedSimple(18,20);
        System.out.println("Two numbers are: " + v.number1 + " , " + v.number2);
        System.out.println("Sum of two numbers = " + v.add());
        System.out.println("Difference of two numbers = " + v.subtract());
        System.out.println("Product of two numbers = " + v.multiply());
        System.out.println("Dividing number 1 by number 2, we get " + v.divide());
    }
}
