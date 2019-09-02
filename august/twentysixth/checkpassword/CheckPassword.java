package com.tekwill.homework.august.twentysixth.checkpassword;

import java.util.Scanner;

public class CheckPassword {
    public static void checkPassword (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = in.nextLine();
        boolean validityCheck1 = true;
        boolean validityCheck2 = false;
        boolean validityCheck3 = true;
        if (password.length() < 8)
            validityCheck1 = false;
        String alphabet = ("A-Za - z0-9");
        if (password.contains(alphabet))
            validityCheck2 = true;
        int digit =0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < password.length(); j++) {
                if (password.charAt(i) == (char)j)
                    digit++;
            }
        }
        if (digit < 2)
            validityCheck3 = false;
        if (validityCheck1 && validityCheck2 && validityCheck3)
            System.out.println("Valid password");
        else
            System.out.println("invalid password format!");
        System.out.println(alphabet);
        }


    }

