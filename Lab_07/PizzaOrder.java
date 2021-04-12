package com.company;
public class PizzaOrder {
    static Pizza[] p1 = new Pizza[3];
    private static int x = 0;
    public PizzaOrder(Pizza pizza){
        p1[x] = pizza;
        x++;
    }
    public static double calculateTotal() {
        double Bill = 0;
        for(int y = 0; y < x; y++){
            double Bill1 = p1[y].CalculateCost();
            Bill = Bill + Bill1;
        }
        return Bill;
    }
}
