package com.company;
public class Object_runner {
    public static void main(String[] args) {
        Object O1 = new Object();
        Object O2 = new Object(122);
        Object O3 = new Object(150);
        System.out.println("Objects created:"+ Object.getObjectscreated());
        System.out.println("Objects created:"+ O1.getObjectscreated());
    }
}
