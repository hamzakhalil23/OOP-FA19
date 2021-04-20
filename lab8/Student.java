package com.company;
class Student extends Person {
    protected String status;
    public Student (String name, String address, String phonenumber, String emailaddress,String status){
        super(name,address,phonenumber,emailaddress);
        this.status = status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}
