package com.tekwill.homework2.august.august26.gamecraps;

import java.util.Random;

public class GameCraps {
    public static void crapsRunning() {
        int sum;
        int roll1;
        int roll2;
        boolean point = false;
        do {
            Random rnd = new Random();
            roll1 = rnd.nextInt(6) + 1;
            roll2 = rnd.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.println("result is: roll 1 = " + roll1 + ", roll 2 = " + roll2 + " | sum is: " + sum);
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose :(");
                point = true;
            } else if (sum == 7 || sum == 11) {
                System.out.println("You won :) ");
                point = true;
            } else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
            System.out.println("point is " + roll1);
            point = false;}

                    }
        while  (point == false);

        }
    }
