package com.company;
public class Pizza_Runner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("large",1,3,2);
        System.out.println(p1.getDescription() + " for Rs." + p1.CalculateCost());

        Pizza p2 = new Pizza("medium",3,0,2);
        System.out.println(p2.getDescription() + " for Rs." + p2.CalculateCost());

        PizzaOrder pizzaOrder_1 = new PizzaOrder(p1);
        PizzaOrder pizzaOrder_2 = new PizzaOrder(p2);
        System.out.println("Your total bill is Rs." + PizzaOrder.calculateTotal());
    }
}