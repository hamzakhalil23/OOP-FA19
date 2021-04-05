package com.company;
public class Calculator_Runner {
    public static void main(String[] args) {
        System.out.println("Product " + Calculator.multiply(10,20));
        System.out.println("Division " + Calculator.divide(10,20));
        System.out.println("Sum " + Calculator.sum(10,20));
        System.out.println("Remainder " + Calculator.modulus(10,20));
        System.out.println("Sine " + Calculator.sin(4));
        System.out.println("cos " + Calculator.cos(3));
        System.out.println("tan " + Calculator.tan(4));
    }
}
