package com.company;
public class Comedy extends Movie{
    @Override
    public double CalcLateFee() {
        int n = getNoOfDays();
        int c ;
        if(n >= 30){
            c = n - 30;
            return c * 2.5;
        }
        else return 0;
    }
}
