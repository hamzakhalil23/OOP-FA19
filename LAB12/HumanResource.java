package com.company;
import java.util.ArrayList;

public class HumanResource {
    private final ArrayList<Association> association = new ArrayList<Association>();
    public void add(Association identity){
        association.add(identity);
        if(identity instanceof Association){
            ((Association)identity).Associate();}
    }
    public void delete(int index) {
        association.remove(index);
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < association.size(); i++) {
            s += association.get(i).toString();
            s += "\n";
        }
        return s;
    }
}
//    private Association [] array;
//    public void add(Association association) {
//        if (array == null) {
//            array = new Association[2];
//            array[0] = association;
//            association.Associate();
//        } else {
//            extend();
//            array[array.length - 2] = association;
//            association.Associate();
//        }
//    }
//    private void extend() {
//        Association[] temp = array;
//        array = new Association[temp.length + 1];
//        for(int i = 0; i < array.length - 2; i++) {
//            array[i] = temp[i];
//        }
//    }
//
//    public void delete(Association association) {
//        Association[] temp =  array;
//        array = new Association[temp.length - 2];
//        for(int i = 0, j = 0; i < array.length; i++) {
//            if(association.equals(temp[j])) {
//                j++;
//            }
//            array[i] = temp[j];
//            j++;
//        }
//    }
//    @Override
//    public String toString() {
//        String s = "";
//        for(int i = 0; i < array.length; i++) {
//            s += array[i] + "\n";
//        }
//        return s;
//    }
//}
//
