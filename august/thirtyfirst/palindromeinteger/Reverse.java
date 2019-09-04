package com.tekwill.homework2.august.thirtyfirst.palindromeinteger;

public class Reverse {
    static int rev = 0;
    static int numberForDisplay;

    public static int reverse(int number) {
        numberForDisplay = number;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        System.out.println("The reverse for " + numberForDisplay + " is: " + rev);
        return rev;
    }

    public static boolean isPalindrome(int number) {
        number = reverse(number);
        if (numberForDisplay != rev)
            System.out.println(numberForDisplay + " is not a palindrome");
             else
            System.out.println(numberForDisplay + " is a palindrome");
             return true;
       }

}