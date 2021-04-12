package com.company;
public class Person {
    private String Name;
    private int contactNum;
    private com.company.Address address;
    public Person(String n, int contactNum, com.company.Address address){
        this.Name = n;
        this.contactNum = contactNum;
        this.address = address;
    }
    public Person(String john, int i) {}
    public void setName(String name){
        this.Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setId(int id){
        this.contactNum = contactNum;
    }
    public int getId(){
        return contactNum;
    }
    public void setAddress(com.company.Address address){
        this.address = address;
    }
    public com.company.Address getAddress(){
        return address;
    }
    public void display() {
        System.out.println(" Name: " + Name + " \n contact Number: " + contactNum + " \n Address: " + address);
        address.display();
    }
}
