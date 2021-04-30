package com.company;
public abstract class Movie {
    public int ID;
    public String title;
    public int NoOfDays;
    public void setID(int id) {
        ID = id;
    }
    public void setNoOfDays(int days) {
        NoOfDays = days;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getID() {
        return ID;
    }
    public int getNoOfDays() {
        return NoOfDays;
    }
    public String getTitle() {
        return title;
    }
    public boolean Compare(Movie a){
        if(this.equals(a))
            return true;
        else
            return false;
    }
    public abstract double CalcLateFee();
}
