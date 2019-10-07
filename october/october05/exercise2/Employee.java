package com.tekwill.homework2.october.october05.exercise2;

public abstract class Employee {
    private String name;
    private double age;
    private double hourRate;

    public abstract double salary(double hours);

    public String toString() {
    return "name " + name + " age= " + age + " hourRate= " + hourRate;
    }
}
