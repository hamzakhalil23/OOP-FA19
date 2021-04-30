package com.company;
public class comissionEmployee {
    protected String FirstName;
    protected String LastName;
    protected String SSN;
    protected double grossSales;
    protected double commonRate;
    public comissionEmployee() {
        FirstName="Nagina";
        LastName="Nazar";
        SSN="S003";
        grossSales=1234.1;
        commonRate=12.5;
    }
    public comissionEmployee (String a,String b,String e, double c, double d){
        FirstName=a;
        LastName=e;
        SSN=b;
        grossSales=c;
        commonRate=d;
    }
    public void setFN(String a){
        FirstName=a;
    }
    public void setLN(String e){
        LastName=e;
    }
    public void setSSN(String b){
        SSN=b;
    }
    public void setGS(double c){
        grossSales=c;
    }
    public void setCR(double d){
        commonRate=d;
    }
    public String getFN(){
        return FirstName;
    }
    public String getSSN(){
        return SSN;
    }
    public double getGS(){
        return grossSales;
    }
    public double getCR(){
        return commonRate;
    }
    public double earnings(){
        return grossSales*commonRate;
    }
    public void display(){
        System.out.println("first name:" + FirstName + ",last name:" + LastName + ",SSN" + SSN + " Gross Sale:" + grossSales + " and commonRate:" + commonRate);
    }
}
class BasePlusComEmployee extends comissionEmployee {
    private double salary;
    BasePlusComEmployee() {
        salary = 48000;
    }
    BasePlusComEmployee(String A, String E, String B, double C, double D, double S) {
        super(A, E, B, C, D);
        salary = S;
    }
    public double earnings() {
        return super.earnings() + salary;
    }
    public void display() {
        super.display();
        System.out.println("Salary : " + salary);
    }
}
