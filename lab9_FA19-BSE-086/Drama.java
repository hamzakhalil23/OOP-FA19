package com.company;
public class Drama extends Movie{
    @Override
    public double CalcLateFee() {
        int n = getNoOfDays(); int m;
        if(n >= 30){
            m = n - 30;
            return m * 2;
        }
        else
            return 0;
    }
}
