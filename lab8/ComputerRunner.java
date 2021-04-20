package com.company;
public class ComputerRunner {
    public static void main(String[] args) {
        System.out.println("1st computer's Details:");
        Computer c1 = new Computer(50,4400,6000,220);
        c1.display();
        System.out.println("1st laptop's Details:");
        Laptop l1 = new Laptop(2000,6000,15000,200,10,15,10,50);
        l1.display();
        System.out.println("2nd computer's Details:");
        Computer c2 = new Computer();
        c2.setWordsize(4000);
        c2.setMemorysize(3000);
        c2.setStoragesize(20000);
        c2.setSpeed(100);
        c2.display();
        System.out.println("2nd laptop's Details:");
        Laptop l2 = new Laptop();
        l2.setWordsize(4500);
        l2.setMemorysize(35000);
        l2.setStoragesize(40000);
        l2.setSpeed(150);
        l2.setLength(12);
        l2.setWidth(16);
        l2.setHeight(15);
        l2.setWeight(75);
        l2.display();
    }
}
