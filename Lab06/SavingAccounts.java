package com.company;
public class SavingAccounts {
    public static double annualInterestRate;
    private int savingBalance;

    public SavingAccounts(int H) {
        this.savingBalance = H;
    }
    public double calculateMonthlyInterestRate() {
        double monthlyInterestRate = (savingBalance * annualInterestRate) / 12;
        double netBalance = monthlyInterestRate + savingBalance;
        System.out.println("total balance = " + netBalance);
        return netBalance;
    }
    public static double modifyInterestRate(double O) {
        annualInterestRate = O;
        return annualInterestRate;
    }
}
