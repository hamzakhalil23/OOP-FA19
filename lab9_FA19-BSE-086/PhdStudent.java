package com.company;
public class PhdStudent extends Student{
    public PhdStudent(String Name, String ID){
        super(Name, ID);
    }
    @Override
    public void TakeExam() {
        super.TakeExam();
        System.out.print("Student will give final defense presentation.");
    }
}
