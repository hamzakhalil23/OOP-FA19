package com.company;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        Person p = new Person();
        p.name = "Hamza";
        p.age = 20;
        File f = new File("p.dat");

        FileOutputStream fileOutputStream = new FileOutputStream(f);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(p);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("saved");
    }
}
