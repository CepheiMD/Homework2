package com.tekwill.homework2.october.october05.exercise3;

public class SportCar implements Printable {
private String name;
private int code;

    public void print() {
        System.out.println("Car name: " + name + " car ID: " + code);
    }

    public SportCar(String name, int code) {
        this.name = name;
        this.code = code;
    }
}


//add getter setter and to string. oprional: Equals and hashcode

in metoda prin putem apela toString in loc de println
