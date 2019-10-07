package com.tekwill.homework2.october.october05.exercise1;

public class Circle extends Shape {
    private double radius;

    public double area() {
        return this.radius * 3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}



