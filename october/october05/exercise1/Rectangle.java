package com.tekwill.homework2.october.october05.exercise1;

public class Rectangle extends Shape {
    private double lenght;
    private double witdth;
    public double area() {
        return this.lenght * this.witdth;
    }

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.witdth = width;
    }
}

