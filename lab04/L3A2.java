package L3A2;

import java.util.Scanner;

public class L3A2 {

    public static void main(String args[]) {
        int x,y,z;
        System.out.println("Time in 24 hours Format.");

        Time t1 = new Time();
        t1.Check();
        t1.Display();

        Scanner in= new Scanner(System.in);
        System.out.println("Enter Hours: ");
        x=in.nextInt();
        System.out.println("Enter Minutes: ");
        y=in.nextInt();
        System.out.println("Enter Seconds: ");
        z=in.nextInt();
        Time t2=new Time(x,y,z);
        t2.Check();
        t2.Display();
    }
}