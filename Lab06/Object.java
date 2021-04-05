package com.company;
public class Object {
    private static int Objects = 0;
    private int a;
    public Object(int x) {
        a = x;
        Objects++;
    }
    public Object(){
        Objects++;
    }
    public static int getObjectscreated(){
        return Objects;
    }
}
