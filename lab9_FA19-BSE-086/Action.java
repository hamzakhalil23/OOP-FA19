package com.company;
public class Action extends Movie {
    @Override
    public double CalcLateFee() {
        int n = getNoOfDays();
        int m;
        if (n >= 30) {
            m = n - 30;
            return m * 3;
        }
        else {
            return 0;
        }
    }
}
