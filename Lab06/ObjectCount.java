package com.company;
public class ObjectCount {
    private static int numofObjects;
    public ObjectCount() {
        numofObjects++;
    }
    public static int numofObjCreated() {
        return numofObjects;
    }
    public static int numofObjDestroyed() {
        return numofObjects;
    }
}