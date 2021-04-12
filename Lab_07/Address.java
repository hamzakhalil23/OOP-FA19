package com.company;
public class Address {
    private int streetNum;
    private int houseNum;
    private String city;
    private int Countrycode;
    public Address(int s, int h, String c, int Cc) {
        streetNum = s;
        houseNum = h;
        city = c;
        Countrycode = Cc;
    }
    public Address(){}
    public void setStreetNo(int s){
        streetNum = s;
    }
    public int getStreetNo(){
        return streetNum;
    }
    public void setHouseNo(int h){
        houseNum = h;
    }
    public int getHouseNo(){
        return houseNum;
    }
    public void setCity(String C){
        city = C;
    }
    public String getCity(){
        return city;
    }
    public void setCode(int Cc){
        Countrycode = Cc;
    }
    public int getCode(){
        return Countrycode;
    }
    public void display(){
        System.out.println("Address \n Street Number : " + streetNum + "House Number : " + houseNum + "City : " + city + "Code : " + Countrycode);
    }
}