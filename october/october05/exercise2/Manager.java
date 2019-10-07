package com.tekwill.homework2.october.october05.exercise2;

public class Manager extends Employee {
    private String name;
    private double age;
    private double hourRate;

    public double salary(double hours) {
        return hourRate * hours;
    }

    public Manager(String name, int age, int hourRate){
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;

    }
    public String toString() {
        return "name " + name + " age= " + age + " hourRate= " + hourRate;
    }
}
