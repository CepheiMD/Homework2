package com.tekwill.homework2.august.august20.reverseastring;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        char reverse;
        Scanner in = new Scanner(System.in);
        String str = in.next();


        for (int i = str.length()-1; i >= 0; i--) {
            reverse = str.charAt(i);
            System.out.print(reverse);

        }


    }
}