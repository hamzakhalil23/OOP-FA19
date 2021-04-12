package com.company;
public class Address_Runner {
    public static void main(String[] args) {
        Address A = new Address(15,108,"New York",78);
        Person P = new Person("Hamza",0312-5783210,A);
        P.display();
        Address B = new Address(10,89,"London",120);
        Person P2 = new Person("Taha",0335-9812457,B);
        P2.display();
    }
}