package com.company;
public class Person {
    protected String Id;
    protected String name;

    public Person( String name, String Id) {
      this.name = name;
      this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
       this.Id = Id;
    }
    @Override
    public String toString() {
        return String.format("Name = %s , ID = %s", getName(), getId());
    }
}
