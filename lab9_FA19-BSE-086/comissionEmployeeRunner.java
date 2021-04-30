package com.company;
public class comissionEmployeeRunner {
    public static void main(String[] args) {
        BasePlusComEmployee b = new BasePlusComEmployee("ali", "ahmed", "25-kkn", 100, 5.2, 25000);
        double earn = b.earnings();
        System.out.println("Earning of employee is: " + earn);
    }
}
