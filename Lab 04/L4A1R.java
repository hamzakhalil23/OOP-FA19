package L4A1;


public class HotDog {
    private int id;
    private int itemssold;
    public HotDog(int a,int b)
    {
        id=a;
        itemssold=b;

    }
    public void justsold()
    {
        itemssold++;
    }
    public int idget()
    {
        return id;
    }
    public int itemget()
    {
        return itemssold;
    }
    public void display(){
        System.out.println("\n HotDog stand with id "+id+" has sold "+itemssold+" HotDogs.\n");
    }
}