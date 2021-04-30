package com.company;
public class GradStudent extends Student{
    public GradStudent(String Name, String ID){
        super(Name, ID);
    }
    @Override
    public void TakeExam() {
        super.TakeExam();
        System.out.print("Student will give written exam.");
    }
}
