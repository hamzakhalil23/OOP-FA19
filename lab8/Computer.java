package com.company;
public class Computer {
    protected double Wordsize;
    protected double Memorysize;
    protected double Storagesize;
    protected double Speed;
    public Computer(){
        Wordsize = 1500;
        Memorysize = 2000;
        Storagesize = 5000;
        Speed = 1200;
    }
    public Computer(double wordSize, double memorySize, double storageSize, double Speed){
        Wordsize = wordSize;
        Memorysize = memorySize;
        Storagesize = storageSize;
        Speed = Speed;
    }
    public void setWordsize(double wordsize) {
        Wordsize = wordsize;
    }
    public void setMemorysize(double memorysize) {
        Memorysize = memorysize;
    }
    public void setStoragesize(double storagesize) {
        Storagesize = storagesize;
    }
    public void setSpeed(double speed) {
        Speed = speed;
    }
    public double getWordsize() {
        return Wordsize;
    }
    public double getMemorysize() {
        return Memorysize;
    }
    public double getStoragesize() {
        return Storagesize;
    }
    public double getSpeed() {
        return Speed;
    }
    public void display(){
        System.out.println("Word size = " + Wordsize + " bits \n Memory size = "+ Memorysize + " megabytes \n" +
                "Storage size = " + Storagesize + " megabytes \n Speed = " + Speed + " megahertz");
    }
}

