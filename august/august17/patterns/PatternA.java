package com.tekwill.homework2.august.august17.patterns;

import java.util.Scanner;

public class PatternA {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("insert the number of rows: ");
            int rows = sc.nextInt();

            for (int i = 0; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }