package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SearchingObjects {
    public static void searchObject(String name) throws IOException {
        Person pRead;
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Hamza\\IdeaProjects\\Lab 14\\person.dat");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            pRead = (Person) objectInputStream.readObject();
            if (pRead.name.equals(name)){
                System.out.println(pRead.name);
                System.out.println(pRead.age);
            }
            else {
                System.out.println("Name not found");
            }
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        SearchingObjects searchingObject = new SearchingObjects();
        searchingObject.searchObject("sail");
    }
}
