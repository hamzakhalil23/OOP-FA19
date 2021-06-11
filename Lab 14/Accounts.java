package com.company;
import java.io.*;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Accounts implements Serializable {
    public String accountNumber;
    public String accountTitle;
    public String accountBalance;
    static int currentAccountIndex = 0;
    public Accounts(String accountNumber, String accountTitle, String accountBalance) {
        this.accountNumber = accountNumber;
        this.accountTitle = accountTitle;
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }
    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountTitle() {
        return accountTitle;
    }
    public String getAccountBalance() {
        return accountBalance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Accounts[] accounts = new Accounts[]
                {
                        new Accounts("1","Hamza","26000"),
                        new Accounts("2","Hassan","54500"),
                        new Accounts("3","Umar","72300"),
                        new Accounts("4","Usman","40000"),
                        new Accounts("5","Ali","97400"),
                        new Accounts("6","Harris","89050"),
                        new Accounts("7","Ahmed","63000"),
                        new Accounts("8","Ammar","39000"),
                        new Accounts("9","Taha","46500"),
                        new Accounts("10","Daniyal","90000"), };
        ArrayList<Accounts> accountsList = new ArrayList<Accounts>();
        for(int i=0; i < accounts.length; i++) {
            accountsList.add(accounts[i]);
        }
        writeObjectToFile(accountsList);
        System.out.println("The Banking system");
        while(true) {
            int opt;
            System.out.println("Enter 1 to deposit.\nEnter 2 to withdraw.\nEnter 3 to transfer.\nEnter 4 to check balance.\nEnter 0 to exit.");
            System.out.println("Enter your choice");
            opt = input.nextInt();
            switch(opt) {
                case 1: {
                    input.nextLine();
                    System.out.println("Enter the account no: ");
                    String account = input.nextLine();
                    System.out.println("Enter the amount you want to deposit: ");
                    String amount = input.nextLine();
                    deposit(account, amount);
                    break;
                }
                case 2: {
                    System.out.println("Enter account no: ");
                    String account = input.nextLine();
                    System.out.println("Enter the amount you want to withdraw: ");
                    String amount = input.nextLine();
                    withdraw(account, amount);
                    break;
                }
                case 3: {
                    System.out.println("Enter account no of sender: ");
                    String account = input.nextLine();
                    System.out.println("Enter account no of receiver: ");
                    String account1 = input.nextLine();
                    System.out.println("Enter the amount you want to transfer: ");
                    String amount = input.nextLine();
                    transfer(account, account1, amount);
                    break;
                }
                case 4: {
                    System.out.println("Enter account no to check balance: ");
                    String balance = input.nextLine();
                    balanceInquiry(balance);
                    break;
                }
            }
            if(opt == 0) {
                System.out.println("Exiting");
                break;
            }
        }
    }
    public static void writeObjectToFile(ArrayList<Accounts> accounts) {
        try {
            File f = new File("Account.txt");

            FileOutputStream fileOutputStream = new FileOutputStream(f);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(accounts);
            objectOutputStream.close();
        }

        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static ArrayList<Accounts> readObjectFromFile() {
        ArrayList<Accounts> accounts = new ArrayList<>();
        try {
            FileInputStream fileInputStream= new FileInputStream("C:\\Users\\Hamza\\IdeaProjects\\Lab 14\\Account.txt");
            java.io.ObjectInputStream objectInputStream= new java.io.ObjectInputStream(fileInputStream);

            accounts = (ArrayList<Accounts>) objectInputStream.readObject();
            objectInputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return accounts;
    }
    public static ArrayList<Accounts> getAccountIndex(String accountNumber) {
        ArrayList<Accounts> accounts = readObjectFromFile();
        for(int i=0; i < accounts.size(); i++) {
            Accounts temp = accounts.get(i);
            if(temp.getAccountNumber().equals(accountNumber))
            {
                currentAccountIndex = i;
                break;
            }
        }
        return accounts;
    }
    public static void balanceInquiry(String accountNumber)
    {
        ArrayList<Accounts> accounts = getAccountIndex(accountNumber);
        System.out.println("Account Number: " +
                accounts.get(currentAccountIndex).getAccountNumber());
        System.out.println("Account Title: " +
                accounts.get(currentAccountIndex).getAccountTitle());
        System.out.println("Account Balance: " +
                accounts.get(currentAccountIndex).getAccountBalance());
    }
    public static void withdraw(String accountNumber, String amount)
    {
        ArrayList<Accounts> accounts = getAccountIndex(accountNumber);
        Accounts account = accounts.get(currentAccountIndex);
        double balance = Double.parseDouble(account.getAccountBalance());
        double amount_d = Double.parseDouble(amount);
        if(amount_d > balance) {
            System.out.println("Transaction cannot be completed, Your balance is not enough!!!");
            return;
        }
        balance = balance - amount_d;
        account.setAccountBalance(String.valueOf(balance));
        System.out.println("Amount: "+ amount + " is being withdrawn from your account.");
        System.out.println("Your new balance is: "+ balance);
        writeObjectToFile(accounts);
    } public static void deposit(String accountNumber, String amount) {
        ArrayList<Accounts> accounts = getAccountIndex(accountNumber);
        Accounts account = accounts.get(currentAccountIndex);
        double balance = Double.parseDouble(account.getAccountBalance());
        double amount_d = Double.parseDouble(amount);
        balance = balance + amount_d;
        account.setAccountBalance(String.valueOf(balance));
        System.out.println("Amount: " + amount + " is being deposited into your account.");
        System.out.println("Your new balance is: "+ balance);
        writeObjectToFile(accounts); }
    public static Accounts getAccount(ArrayList<Accounts> accounts, String accountNumber) {
        for(int i=0; i < accounts.size(); i++) {
        Accounts temp = accounts.get(i);
        if(temp.getAccountNumber().equals(accountNumber)) {
            return temp;
        }
    }
        return null;
    }
    public static void transfer(String fromAccountNumber,String toAccountNumber, String
            amount) { ArrayList<Accounts> accounts = readObjectFromFile();
        Accounts fromAccount = getAccount(accounts,fromAccountNumber);
        Accounts toAccount = getAccount(accounts,toAccountNumber);
        if(fromAccount == null)
        {
            System.out.println("From account number is not found");
            return;
        }
        if(toAccount == null) {
            System.out.println("To account number is not found");
            return;
        }
        double amount_d = Double.parseDouble(amount);
        double fromBalance = Double.parseDouble(fromAccount.getAccountBalance());
        double toBalance = Double.parseDouble(toAccount.getAccountBalance());
        if(amount_d > fromBalance)
        {
            System.out.println("Transaction not possible");
            return;
        }
        fromBalance = fromBalance - amount_d;
        toBalance = toBalance + amount_d;
        fromAccount.setAccountBalance(String.valueOf(fromBalance));
        toAccount.setAccountBalance(String.valueOf(toBalance));
        System.out.println("Amount: "+ amount + " is being transferred from account number: " + fromAccountNumber+" to: "+toAccountNumber);
        writeObjectToFile(accounts);
    }
}
