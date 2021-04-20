package com.company;
public class Publications {
    protected String Title;
    protected int Price;
    public Publications(String title, int price){
        Title = title;
        Price = price;
    }
    public void setTitle(String title){
        Title = title;
    }
    public void setPrice(int price){
        Price = price;
    }
    public String getTitle(){
        return Title;
    }
    public int getPrice(){
        return Price;
    }
    public void display(){
        System.out.println("Price of publication = " + Title + "is $" + Price);
    }
}
