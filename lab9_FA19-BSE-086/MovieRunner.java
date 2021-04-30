package com.company;
public class MovieRunner {
    public static void main(String[] args) {
        Movie m1 = new Action();
        Movie m2 = new Comedy();
        Movie m3 = new Drama();
        m1.setTitle("The final destination");
        m1.setID(1);
        m1.setNoOfDays(31);
        m2.setTitle("Pink Panther");
        m2.setID(2);
        m2.setNoOfDays(90);
        m3.setTitle("Revenge");
        m3.setID(3);
        m3.setNoOfDays(13);
        System.out.println("Are these movies equal? " + m1.equals(m2));
        System.out.println(m1.getTitle() + ": " + m1.CalcLateFee());
        System.out.println(m2.getTitle() + ": " + m2.CalcLateFee());
        System.out.println(m3.getTitle() + ": " + m3.CalcLateFee());
    }
}
