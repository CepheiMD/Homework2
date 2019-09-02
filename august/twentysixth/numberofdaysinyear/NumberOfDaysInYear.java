package com.tekwill.homework.august.twentysixth.numberofdaysinyear;

import java.util.Scanner;

public class NumberOfDaysInYear {

    public static int numberOfDaysInAYear(int year) {
        boolean leap = false;
        int numberOfDays;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else
                    leap = false;
            } else
                leap = true;
        }
        if (leap)
            numberOfDays = 366;
        else numberOfDays = 365;
        return numberOfDays;
        }

    }




