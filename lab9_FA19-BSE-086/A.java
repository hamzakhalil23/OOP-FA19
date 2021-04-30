package com.company;
public class A {
    public A(int a, int b) {
}
    class a {
        int i, j;
        a (int a, int b) {
            i = a;
            j = b;
        }
        void show() {
            System.out.println("i and j: " + i + " " + j);
        }
    }
    static class B extends A {
        int k;
        B(int a, int b, int c) {
            super(a, b);
            k = c;
        }
        void show() {
            System.out.println("k: " + k);
        }
    }
}
