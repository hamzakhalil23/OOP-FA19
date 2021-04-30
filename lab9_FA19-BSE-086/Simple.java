package com.company;
public class Simple {
    protected double number1;
    protected double number2;
    public Simple(double num1, double num2){
        this.number1 = num1;
        this.number2 = num2;
    }
    public void setNumber1(double number1) {
        this.number1 = number1;
    }
    public double getNumber1() {
        return number1;
    }
    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public double getNumber2() {
        return number2;
    }
    public double add(){
        return (number1 + number2);
    }
    public double subtract(){
        return (number1 - number2);
    }
    public double multiply(){
        return (number1 * number2);
    }
    public double divide(){
        return (number1 / number2);
    }
}
