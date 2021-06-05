package com.company;
import java.util.Scanner;
public class Teacher extends Person implements Association{
    private String designation;
    private String Department;

    public Teacher(String name, String id) {
        super(name, id);
    }
    @Override
    public String getId() {
        return Id;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String d) {
        designation = d;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String D) {
        Department = D;
    }
    @Override
    public String toString(){
        return "Teacher [" + super.toString() + "\t" + String.format("Designation = %s , Department = %s",designation, Department)+"]";
    }

    @Override
    public void Associate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Designation of Teacher: ");
        designation = sc.nextLine();
        System.out.print("Enter Department of Teacher: ");
        Department = sc.nextLine();
    }
}
