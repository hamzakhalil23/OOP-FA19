package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ObjectInputStream {
    public static void main(String[] args) {
        Person p;
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Hamza\\IdeaProjects\\Lab 14\\p.dat");
            java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(fileInputStream);
            p = (Person) objectInputStream.readObject();
            System.out.println(p.name);
            System.out.println(p.age);
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}