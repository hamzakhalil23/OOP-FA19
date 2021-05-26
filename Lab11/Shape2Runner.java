package com.company;
public class Shape2Runner {
    public static void main(String[] args) {
        Shape2[] S;
        S = new Shape2[6];
        S[0] = new Rectangle2(10,15);
        S[1] = new Rectangle2(15,20);
        S[2] = new Circle2(5);
        S[3] = new Circle2(7);
        S[4] = new Triangle2(8,10);
        S[5] = new Triangle2(6,8);

        double[] a;
        a = CalculateAreas.Area(S);
        System.out.println("Area: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
