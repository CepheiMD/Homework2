package com.tekwill.homework2.october.october05.exercise3;

public class Manager implements Printable {
    private String name;
    private int ID;
    public void print() {
        System.out.println("Manager " + name + ", ID: " + ID);
        }

        public Manager(String name, int ID){
        this.name = name;
        this.ID = ID;

        }
}
