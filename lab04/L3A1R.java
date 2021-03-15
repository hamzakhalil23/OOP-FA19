package L3;

public class Marks {
    private int a,b,c;
    public Marks(){
        a=10;
        b=20;
        c=30;
    }

    public Marks(int x, int y, int z){
        a=x;
        b=y;
        c=z;

    }

    public void displayx(){
        System.out.println(a);
    }

    public void displayy(){
        System.out.println(b)
        ;
    }

    public void displayz(){
        System.out.println(c);
    }

    public int Sum(){
        int sum = a+b+c;
        return sum;
    }

}