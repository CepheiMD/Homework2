package com.tekwill.homework.august.twentyth.headsortails;

import java.util.Random;

public class HeadsAndTails {
    public static void main(String[] args) {
        Random rnd = new Random();
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1_000_000; i++) {
            int value = rnd.nextInt();
            if (value % 2 == 0) {
                heads++;
            }else{
                tails++;
            }
        }
        System.out.println("The result is | Heads: " + heads +", Tails: " + tails);

    }
}