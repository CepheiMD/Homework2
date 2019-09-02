package com.tekwill.homework.august.twentysixth.matrixofzeroandones;

import java.util.Random;
import java.util.Scanner;

public class MatrixOdZeroAndOne {
    public static void printMatrix(int n) {
        Random rnd = new Random(2);
        int i;
        int j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                int number = rnd.nextInt();
                if (number > 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");

            }
            j++;
            System.out.println();

        }


    }
}
