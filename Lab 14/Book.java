package com.company;
import java.io.*;
import java.io.ObjectInputStream;

public class Book implements Serializable {
    public String bookName;
    public String publisher;
    public Person author;

    public Book(String bookName, String publisher, Person author) throws FileNotFoundException, IOException {
        this.bookName = bookName;
        this.publisher = publisher;
        this.author = author;
    }

    public void display() {
        try {

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Hamza\\IdeaProjects\\Lab 14\\BookStore.txt");
            java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(fileInputStream);
            for (int i=1;i<6;i++){
                Book obj = (Book) objectInputStream.readObject();
                System.out.println("  Book " + i);
                System.out.println("Name of the Book: " + obj.bookName);
                System.out.println("Publisher of the Book: " + obj.publisher);
                System.out.println("Author Name: " + obj.author.name);
                System.out.println("Author's age: " + obj.author.age);
                System.out.println();

            }

            fileInputStream.close();
            objectInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void searchBook(String bookName) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Hamza\\IdeaProjects\\Lab 14\\BookStore.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println(" Finding " + bookName);
            for (int i=1; i<6; i++){
                Book book = (Book) objectInputStream.readObject();

                if (book.bookName.equals(bookName)) {

                    System.out.println(bookName + " found ");
                    System.out.println(" Book name: " + book.bookName);
                    System.out.println(" Publisher name: " + book.publisher);
                    System.out.println(" Author name: " + book.author.name);
                    System.out.println(" Author age: " + book.author.age);
                    break;
                }
                continue;
            }
            System.out.println("not found");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Person p = new Person();
        p.name = " Tolstoy ";
        p.age = 22;
        Book b = new Book("War and Peace", "Random House", p);
        Person p1 = new Person();
        p1.name = " Gustave Flaubert";
        p1.age = 30;
        Book b1 = new Book(" Madame Bovary ", "Bloomsbury", p1);
        Person p2 = new Person();
        p2.name = "F. Scott Fitzgerald";
        p2.age = 34;
        Book b2 = new Book("The Great Gatsby", "Macmillan", p2);
        Person p3 = new Person();
        p3.name = "Emily Bronte";
        p3.age = 40;
        Book b3 = new Book("Wuthering Heights","Harper Collins", p3);

        File f = new File("BookStore.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(f);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(b);
            objectOutputStream.writeObject(b1);
            objectOutputStream.writeObject(b2);
            objectOutputStream.writeObject(b3);
            System.out.println("Books saved");
            objectOutputStream.close();
            fileOutputStream.close();

        }
        catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("                      Displaying books            ");
        System.out.println();

        b.display();
        b.searchBook("Invisible Man");
    }
}
