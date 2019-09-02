package com.tekwill.homework.august.twentyth.longestcommonprefix;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = in.nextLine();
        System.out.println("Enter the second string:");
        String secondString = in.nextLine();
        String commonPart = "";

        for (int i = 0; i < firstString.length() && i < secondString.length(); i++) {
            if (firstString.charAt(i) == secondString.charAt(i)) {
                commonPart += firstString.charAt(i);
                        }

            }
        System.out.println(commonPart);
        }

    }

