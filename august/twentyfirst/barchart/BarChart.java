package com.tekwill.homework.august.twentyfirst.barchart;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sales for store 1: ");
        int salesStore1 = in.nextInt();
        System.out.println("Enter sales for store 2: ");
        int salesStore2 = in.nextInt();
        System.out.println("Enter sales for store 3: ");
        int salesStore3 = in.nextInt();
        System.out.println("Enter sales for store 4: ");
        int salesStore4 = in.nextInt();
        System.out.println("Enter sales for store 5: ");
        int salesStore5 = in.nextInt();
        int i;

        for (i = salesStore1; i >= 100; i -= 100) {
            System.out.print('*');
        }
        System.out.println();
        for (i = salesStore2; i >= 100; i -= 100) {
            System.out.print('*');
        }
        System.out.println();
        for (i = salesStore3; i >= 100; i -= 100) {
            System.out.print('*');

        }
        System.out.println();
        for (i = salesStore4; i >= 100; i -= 100) {
            System.out.print('*');

        }
        System.out.println();
        for (i = salesStore5; i >= 100; i -= 100) {
            System.out.print('*');

        }
        System.out.println();
    }
}