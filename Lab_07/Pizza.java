package com.company;
public class Pizza {
    private String size_of_Pizza;
    private int num_of_Cheesetoppings;
    int num_of_PepperoniToppings;
    int num_of_HamToppings;
    public Pizza(){
    }
    public Pizza(String size_of_pizza, int cheese_toppings, int pepperoni_toppings, int ham_toppings){
        this.size_of_Pizza = size_of_pizza;
        this.num_of_Cheesetoppings = cheese_toppings;
        this.num_of_PepperoniToppings = pepperoni_toppings;
        this.num_of_HamToppings = ham_toppings;
    }
    public void setSize_of_Pizza(String size_of_Pizza) {
        this.size_of_Pizza = size_of_Pizza;
    }
    public String getSize_of_Pizza() {
        return size_of_Pizza;
    }
    public void setNum_of_Cheesetoppings(int num_of_Cheesetoppings) {
        this.num_of_Cheesetoppings = num_of_Cheesetoppings;
    }
    public int getNum_of_Cheesetoppings() {
        return num_of_Cheesetoppings;
    }
    public void setNum_of_PepperoniToppings(int num_of_PepperoniToppings) {
        this.num_of_PepperoniToppings = num_of_PepperoniToppings;
    }
    public int getNum_of_PepperoniToppings(){
        return num_of_PepperoniToppings;
    }
    public void setNo_of_hamToppings(int no_of_hamToppings) {
        this.num_of_HamToppings=num_of_HamToppings;
    }
    public int getNo_of_hamToppings() {
        return num_of_HamToppings;
    }
    public double CalculateCost(){
        if (size_of_Pizza == "Small"){
            double pizza_cost = 10 + ((2 * num_of_Cheesetoppings) + (2 * num_of_PepperoniToppings)
                    + (2 * num_of_HamToppings));
            return pizza_cost;
        }
        else if(size_of_Pizza == "Medium"){
            double pizza_cost = 12 + ((2 * num_of_Cheesetoppings) + (2 * num_of_PepperoniToppings)
                    + (2 *num_of_HamToppings));
            return pizza_cost;
        }
        else if(size_of_Pizza == "Large"){
            double pizza_cost = 14 + ((2 * num_of_Cheesetoppings) + (2 * num_of_PepperoniToppings)
                    + (2 * num_of_HamToppings));
            return pizza_cost;
        }
        return 0;
    }
    public String getDescription(){
        return ("You ordered a " + size_of_Pizza + " pizza with " + num_of_Cheesetoppings +
                " cheese toppings," + num_of_PepperoniToppings + " pepperoni toppings and "
                + num_of_HamToppings + " ham toppings");
    }
}