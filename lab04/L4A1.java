package L4A1;

import java.util.Scanner;

public class L4A1 {

    public static void main(String args[]) {
        int id, sale, choice, choice2;
        Scanner in= new Scanner(System.in);
        System.out.println("Press 1 to create a HotDog Stand:");
        choice=in.nextInt();
        while(choice==1){
            System.out.println("Enter HotDog stand Id no : ");
            id=in.nextInt();
            System.out.println("Enter Initially sold Hot Dogs : ");
            sale=in.nextInt();
            HotDog h=new HotDog(id,sale);
            System.out.println("Press 1 if you sold a HotDog : ");
            choice2=in.nextInt();
            while(choice2==1){
                h.justsold();
                h.display();
                System.out.println("Press 1 if you sold a HotDog or press 0 to end : ");
                choice2=in.nextInt();
            }
            System.out.println("Total HotDogs sold by stand no: "+h.idget()+" is: "+h.itemget());
            System.out.println("Press 1 to create another HotDog Stand or press 0 to end:");
            choice=in.nextInt();
        }

    }
}