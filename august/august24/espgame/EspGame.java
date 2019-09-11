package com.tekwill.homework2.august.august24.espgame;

import java.util.Random;
import java.util.Scanner;

public class EspGame {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int guessCounter = 0;

        for (int i = 0; i < 10; i++) {
            int compChoiceNr = rnd.nextInt(4);
            String compChoiceColor = "";
            switch (compChoiceNr) {
                case (0):
                    compChoiceColor = "Red";
                    break;
                case (1):
                    compChoiceColor = "Green";
                    break;
                case (2):
                    compChoiceColor = "Blue";
                    break;
                case (3):
                    compChoiceColor = "Orange";
                    break;
                case (4):
                    compChoiceColor = "Yellow";
                    break;
            }
            System.out.println("Please enter a color (Red or Green or Blue or Orange or Yellow): "
                    + " (attempt number " + (i + 1) + " )");
            String userChoice = sc.nextLine();
            System.out.println("Computer choice is " + compChoiceColor);
            if (compChoiceColor.equalsIgnoreCase(userChoice)) {
                guessCounter++;
                System.out.println("You guessed!!!");
            }

        }
        System.out.println("You guessed " + guessCounter + " times");
    }
}
