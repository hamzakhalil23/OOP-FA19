package com.company;
class Book extends Publications {
    protected int Pagecount;
    public Book(String title, int price, int pagecount) {
        super(title, price);
        Pagecount = pagecount;
    }
    public void setPageCount(int pagecount) {
        Pagecount = pagecount;
    }
    public int getPageCount() {
        return Pagecount;
    }
    public void display(){
        super.display();
        System.out.println("Page Count: " + Pagecount);
    }
}
class Tape extends Publications{
    protected int Playingtime;
    public Tape(String title, int price, int playingtime){
        super(title,price);
        Playingtime = playingtime;
    }
    public void setPlayingTime(int playingtime){
        Playingtime = playingtime;
    }
    public int getPlayingTime(){
        return Playingtime;
    }
    public void display(){
        super.display();
        System.out.println("Playing Time: " + Playingtime);
    }
}
