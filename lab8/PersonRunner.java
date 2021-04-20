package com.company;
public class PersonRunner {
    public static void main(String[] args) {
        System.out.println("Student Details");
        Student s1 = new Student("Ali","street 20 house 201","03335167902","john345@yahoo.com","Owner");
        s1.display();
        System.out.println("Employee Details");
        Employee e1 = new Employee("Hamza","street 60 house 180","03331567238","hamza123@gmail.com","KFC",35000,28-4-2010);
        e1.display();
        System.out.println("Faculty Details");
        Faculty f1 = new Faculty("Haris","street 42 house 193","03167083210","haris360@gmail.com","Nestle",40000,15-12-2020,10,"Sales person");
        f1.display();
        System.out.println("Staff Details");
        Staff S1 = new Staff("Usama","street 84 house 212","03459268470","usama770@yahoo.com","Toyota",100000,8-9-2016,"Manager");
        S1.display();
    }
}
