package com.tekwill.homework.august.seventeenth.patterns;

import java.util.Scanner;

public class PatternB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert the number of rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >=0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}