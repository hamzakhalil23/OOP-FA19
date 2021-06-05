package com.company;
import java.util.Scanner;
public class Student extends Person implements Association{
        private int rollNo;
        private int semester;
        public Student(String name, String id) {
            super(name, id);
        }
        @Override
        public String toString(){
            return "Student [" + super.toString() + "\t" + String.format("Roll No = %s , Semester = %s ", rollNo, semester) + "]";

        }
        @Override
        public void Associate() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll Number of student:  ");
            rollNo = sc.nextInt();
            System.out.print("Enter Semester of student: ");
            semester = sc.nextInt();
        }
}
