package com.company;
public class Clock {
    String hours;
    String  minutes;
    String seconds;
    public Clock(String hours, String minutes, String seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void display(){
        System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
    }
}
