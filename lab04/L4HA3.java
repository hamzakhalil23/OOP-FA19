
package lab04;

public class L4HA3 {
  public static void main(String args[]) {
        int[] mark1={20,30,40,10,50};
        Student s1=new Student("Ali",mark1);
        int avg1=s1.Average();
        
        int[] mark2={10,70,30,40,50};
        Student s2=new Student("Zeeshan",mark2);
        int avg2=s2.Average();
         if(avg1>avg2){
             System.out.println("Student1 has greater average. "+avg1);
         }
         else{
             System.out.println("Student2 has greater average. "+avg2);
         }
    }
}
