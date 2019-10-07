package com.tekwill.homework2.october.october05.exercise3;

public class Rectangle implements Printable {

    private int length;
    private int width;

    public void print(){
        System.out.println("lenght: " + length + ", width: " + width);
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
