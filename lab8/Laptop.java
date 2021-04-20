package com.company;
public class Laptop extends Computer {
    protected double Length;
    protected double Width;
    protected double Height;
    protected double Weight;
    public Laptop() {
        Length = 12;
        Width = 15;
        Height = 17;
        Weight = 50;
    }
    public Laptop(double wordSize, double memorySize, double storageSize, double Speed, double length,
                  double width, double height, double weight) {
        super(wordSize, memorySize, storageSize, Speed);
        Length = length;
        Width = width;
        Height = height;
        Weight = weight;
    }

    public void setLength(double length) {
        Length = length;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }
    public double getLength() {
        return Length;
    }
    public double getWidth() {
        return Width;
    }
    public double getHeight() {
        return Height;
    }
    public double getWeight() {
        return Weight;
    }
    public void display() {
        super.display();
        System.out.println("Length= " + Length + "\nWidth = " + Width + "\nHeight = " + Height + "\nWeight = " + Weight);
    }
}
