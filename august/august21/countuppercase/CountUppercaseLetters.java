package com.tekwill.homework2.august.august21.countuppercase;

import java.util.Scanner;

public class CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entrer the word: ");
        String word =in.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(Character.isUpperCase(c))
                count++;
        }
        System.out.println("The expression \"" + word + "\" has " + count + " letters in uppercase");
    }
}
