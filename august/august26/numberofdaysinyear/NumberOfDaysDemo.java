package com.tekwill.homework2.august.august26.numberofdaysinyear;

public class NumberOfDaysDemo {
    public static void main(String[] args) {
        int i;
        for (i = 2000; i <= 2400; i++) {
            System.out.println("Year " + i + " has " + NumberOfDaysInYear.numberOfDaysInAYear(i) + " days!");
        }

    }
}
