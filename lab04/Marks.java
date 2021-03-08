/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author cui
 */
public class Marks {
    private int x,y,z;
    public Marks(){
        x=10;
        y=20;
        z=30;
    }
    
    public Marks(int a, int b, int c){
        x=a;
        y=b;
        z=c;
        
    }
    public void setx(int a){
        x=a;
    }
    public void sety(int b){
        y=b;
    }
    public void setz(int c){
        z=c;
    }
    
     public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public int getz(){
        return z;
    }
    public void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
    public void Sum(){
        int sum = x+y+z;
        System.out.println("SUM is :"+sum);;
    }
}
