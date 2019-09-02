package com.tekwill.homework.august.twentyfourth.displaypattern;

import java.util.Scanner;

public class DisplayPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfRows = in.nextInt();
        int i, j;

        for (i = 0; i <= numberOfRows; i++) {
            for (j = i; j <=numberOfRows; j++)
                System.out.print("  ");
            for (j = i; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();


        }
    }
}