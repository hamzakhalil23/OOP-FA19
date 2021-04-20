package com.company;
public class Person {
    protected String name;
    protected String address;
    protected String phonenumber;
    protected String emailaddress;
    public Person(String name, String address, String phonenumber, String emailaddress){
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }
    public void display(){
        System.out.println("Name: " + name + "\n Address: " + address +
                "\n Phone Number: " + phonenumber + "\n Email Address: " + emailaddress);
    }
}
