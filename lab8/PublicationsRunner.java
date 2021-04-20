package com.company;
import java.util.Scanner;
public class PublicationsRunner {
    public static void main(String[] args) {
        int selection;
        Scanner S = new Scanner(System.in);
        String[] s = {"\nPress 1 for books", "\nPress 2 for audio cassette",
                "\nPress 0 to return to main menu"};
        System.out.println("Choose an option" + s[0] + s[1] + s[2]);
        selection = S.nextInt();
        while (selection >= 1 && selection < s.length) {
            if(selection == 0){
                System.out.println("Main Menu");
            }
            else if (selection == 1) {
                System.out.println("Enter book title, price and page count:");
                Book b1 = new Book(S.next(), S.nextInt(), S.nextInt());
                b1.display();
            }
            else if (selection == 2) {
                System.out.println("Enter audio cassette's title, price and page count:");
                Tape t1 = new Tape(S.next(), S.nextInt(), S.nextInt());
                t1.display();
            }
            System.out.println("Choose an option" + s[0] + s[1] + s[2]);
            selection = S.nextInt();
        }
    }
}
