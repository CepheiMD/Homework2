package com.tekwill.homework2.august.august20.processstring;

import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = in.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0){
                System.out.print(string.charAt(i));
            }
        }
    }
}
