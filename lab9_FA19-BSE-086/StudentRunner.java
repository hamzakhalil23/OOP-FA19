package com.company;
public class StudentRunner {
    public static void main(String[] args) {
        PhdStudent student1 = new PhdStudent("Hamza","4578920");
        student1.TakeExam();

        GradStudent student2 = new GradStudent("Ali","4578922");
        student2.TakeExam();
    }
}
