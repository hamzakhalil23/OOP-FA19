package com.company;
class Employee extends Person {
    protected String office;
    protected double salary;
    protected int datehired;
    public Employee(String name, String address, String phonenumber, String emailaddress, String office,
                      double salary, int datehired){
        super(name,address,phonenumber,emailaddress);
        this.office = office;
        this.salary = salary;
        this.datehired = datehired;
    }
    public void display(){
        super.display();
        System.out.println("Office = " + office + "\n Salary = " + salary + "\n Date of Hire = " + datehired);
    }
}
class Faculty extends Employee{
    protected int officehours;
    protected String rank;
    public Faculty(String name, String address, String phonenumber, String emailaddress, String office,
                   double salary, int datehired, int office_hours, String rank){
        super(name,address,phonenumber,emailaddress,office,salary,datehired);
        this.officehours = office_hours;
        this.rank = rank;
    }
    public void display() {
        super.display();
        System.out.println("Office hours = " + officehours + "\n Rank = " + rank);
    }
}
class Staff extends Employee{
    protected String title;
    public Staff(String name, String address, String phonenumber, String emailaddress, String office,
                 double salary, int dateHired, String title){
        super(name,address,phonenumber,emailaddress,office,salary,dateHired);
        this.title = title;
    }
    public void display() {
        super.display();
        System.out.println("Title = " + title);
    }
}