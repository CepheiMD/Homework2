package com.tekwill.homework2.august.august26.checkpassword;

import java.util.Scanner;

public class CheckPassword {
    public static void checkPassword() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = in.nextLine();
        boolean validityCheck1 = true;
        boolean validityCheck2 = true;
        boolean validityCheck3 = true;
        if (password.length() < 8)
            validityCheck1 = false;
        for (int j = 0; j < password.length(); j++) {
            if (!Character.isLetterOrDigit(password.charAt(j)))
                validityCheck2 = false;
        }
        int digit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                digit++;
        }
        if (digit < 2)
            validityCheck3 = false;
        if (validityCheck1 && validityCheck2 && validityCheck3) {
            System.out.println("Valid password");
        } else
            System.out.println("Invalid password!");
    }
}



