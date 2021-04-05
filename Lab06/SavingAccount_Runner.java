package com.company;
public class SavingAccount_Runner {
    public static void main(String[] args) {
        SavingAccounts Saver1 = new SavingAccounts(2000);
        SavingAccounts Saver2 = new SavingAccounts(3000);
        Saver1.modifyInterestRate(0.03);
        Saver2.modifyInterestRate(0.03);
        System.out.println("total balance for Saver1 = " + Saver1.calculateMonthlyInterestRate());
        System.out.println("total balance for Saver2 = " + Saver2.calculateMonthlyInterestRate());
        Saver1.modifyInterestRate(0.04);
        Saver2.modifyInterestRate(0.04);
        System.out.println("total balance for Saver1 = " + Saver1.calculateMonthlyInterestRate());
        System.out.println("total balance for Saver2 = " + Saver2.calculateMonthlyInterestRate());
    }
}
