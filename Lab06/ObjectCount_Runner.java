package com.company;
public class ObjectCount_Runner {
    public static void main(String[] args) {
        ObjectCount O1 = new ObjectCount();
        ObjectCount O2 = new ObjectCount();
        ObjectCount O3 = new ObjectCount();
        System.out.println("total number of objects created " + ObjectCount.numofObjCreated());
        O1.numofObjDestroyed();
        O2.numofObjDestroyed();
        O3.numofObjDestroyed();
        System.out.println("total number of objects destroyed " + ObjectCount.numofObjDestroyed());
    }
}