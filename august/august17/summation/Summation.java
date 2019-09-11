package com.tekwill.homework2.august.august17.summation;

public class Summation {
    public static void main(String[] args) {
        int i, j;
        double result = 0.0;
        for (i = 1, j = 2; i < 624.0; i++, j++) {
            result += (1 / (Math.sqrt(i) + Math.sqrt(j)));
          // System.out.println(result);
        }
        System.out.printf("%s %.4f","The result is",result);
    }
}
