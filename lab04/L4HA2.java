
package lab04;

import java.util.Scanner;


public class L4HA2 {
      public static void main(String args[]) {
        int bal,choice;
        Accounts a1= new Accounts();
        bal=a1.getbalance();

        
        Accounts a2= new Accounts(bal);
        a1.getbalance();
        System.out.println("Press 1 to deposit Funds or Press 2 to Withdrew Funds : ");
        Scanner s1=new Scanner(System.in);
        
        choice = s1.nextInt();
        if (choice==1){
            bal= s1.nextInt();
            a2.Deposit(bal);
        }
        else{
            bal= s1.nextInt();
          a2.Withdraw(bal);  
        }
    }
}

    

