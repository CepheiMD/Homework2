package com.tekwill.homework2.august.august21.countvowelsandconsonants;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String ourString = in.nextLine().toLowerCase();
        int vowelsCount = 0;
        int consonantsCount = 0;
        char c;

        for (int i = 0; i < ourString.length(); i++) {
            c = ourString.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c== 'o' || c =='u') {
                vowelsCount++;
            }else{
                if (c > 'a' && c < 'z'){
                    consonantsCount++;
                }
            }
        }
        System.out.println("vowels: " + vowelsCount + "\nconsonants: " + consonantsCount);
    }
}
