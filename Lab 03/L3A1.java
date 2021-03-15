package L3;

import java.util.Scanner;


public class L3A1 {

    public static void main(String args[]) {
        int a,b,c,sum;
        Marks m1=new Marks();
        sum=m1.Sum();
        System.out.println("The Sum is : "+sum);

        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter 3 numbers :");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        Marks m2= new Marks(a,b,c);
        sum=m2.Sum();
        System.out.println("The Sum is : "+sum);
    }
}
