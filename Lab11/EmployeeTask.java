package com.company;
public class EmployeeTask implements RegisterForExams{
    private String name;
    private String date;
    private int salary;
    public EmployeeTask() {
        name = null;
        date = null;
        salary = 0;
    }
    public EmployeeTask(String name,String date,int salary) {
        this.name = name;
        this.date = date;
        this.salary = salary;
    }
    @Override
    public void register() {
        System.out.println("Name " + name + "\nsalary " + salary + "\n Employee registered on " + date);
    }
}
