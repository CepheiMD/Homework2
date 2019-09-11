package com.tekwill.homework2.august.august17.computepi;


public class PiDemo {
    public static void main(String[] args) {
        double pi = 4.0;
        double computedValue = 0;
                for (double i = 1.0; i <= 200_000; i += 1) {
            computedValue += (Math.pow(-1,i+1))/(2*i-1);
        }
        System.out.println(pi * computedValue);
    }
}
