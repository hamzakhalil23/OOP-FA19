package com.company;
public class Runner {
    public static void main(String[] args) {
        HumanResource HR = new HumanResource();
        Association teacher1 = new Teacher("John", "478BG");
        Association teacher2 = new Teacher("Michael", "712NQ");
        Association student1 = new Student("Clark", "173MK");
        Association student2 = new Student("Racheal", "926YT");
        HR.add(teacher1);
        HR.add(student2);
        HR.delete(1);
        System.out.println(HR);
    }
}
