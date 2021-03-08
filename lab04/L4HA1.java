
package lab04;

public class L4HA1 {
    public static void main(String args[]) {
      int x,y,z;
      Marks m1=new Marks();
      m1.setx(5);
      m1.sety(10);
      m1.setz(15);
      m1.Sum();
      
  
        x=m1.getx();
        y=m1.gety();
        z=m1.getz();
        Marks m2= new Marks(x,y,z);
        m2.Sum();
        m2.display();
    }
    
}
