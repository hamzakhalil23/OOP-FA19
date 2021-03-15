package L3A2;

public class Time {
    public int hr,mint,sec;
    public Time(){
        hr=9;
        mint=30;
        sec=43;
    }
    public Time(int x,int y,int z){
        hr =x;
        mint=y;
        sec=z;
    }

    public void Check(){
        if(hr>24 || mint>60 || sec>60){
            System.out.println("Time format is invalid");
        }else{
            System.out.println("Time format is valid");
        }
    }

    public void Display(){
        System.out.println("Time is "+hr+" hours : "+mint+" minutes : "+sec+" sec");
    }
}