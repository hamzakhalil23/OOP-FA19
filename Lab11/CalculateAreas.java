package com.company;
public class CalculateAreas {
    public static double[] Area(Shape2[] S) {
       double [] Area = new double[S.length];
        for (int i = 0; i < S.length; i++) {
            if (S[i] != null) {
                Area[i] = S[i].area();
            }
        }
        return Area;
    }
}
