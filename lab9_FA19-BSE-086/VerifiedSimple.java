package com.company;
public class VerifiedSimple extends Simple{
    public VerifiedSimple(double number1, double number2){
        super(number1, number2);
    }
    @Override
    public double add() {
        if (number1 > 0 && number2 >0) {
            return super.add();
        }
        else{
            return 0;
        }
    }
    @Override
    public double subtract() {
        if (number1 > 0 && number2 >0) {
            return super.subtract();
        }
        else {
            return 0;
        }
    }
    @Override
    public double multiply() {
        if (number1 > 0 && number2 >0) {
            return super.multiply();
        }
        else{
            return 0;
        }
    }
    @Override
    public double divide() {
        if (number1 > 0 && number2 >0) {
            return super.divide();
        }
        else {
            return 000;
        }
    }
}
