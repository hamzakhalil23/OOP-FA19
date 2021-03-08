
package lab04;

    public class Student {
    private int[] Result_Array=new int[5];
    private String Name;
    private int sum=0,avg=0;
    public Student(String name,int[] mark){
        String Name=name;
        for(int i=0;i<5;i++){
            Result_Array[i]=mark[i];
        }
                  

    }
    public int Average(){
        for(int i=0;i<5;i++){
            sum=sum+Result_Array[i];
        }
        avg=sum/3;
        return avg;
    }
    
}

