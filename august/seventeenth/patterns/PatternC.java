package com.tekwill.homework.august.seventeenth.patterns;

import java.util.Scanner;

public class PatternC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
