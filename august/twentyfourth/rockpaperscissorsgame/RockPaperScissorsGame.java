package com.tekwill.homework.august.twentyfourth.rockpaperscissorsgame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static String computerChoice() {
        Random rnd = new Random();
        String compChoice;
        if (rnd.nextInt(3) == 0) {
            compChoice = "Rock";
        } else if (rnd.nextInt(3) == 1) {
            compChoice = "Paper";
        } else {
            compChoice = "Scissors";
        }
        return compChoice;
    }

    public static String userChoice() {
        Scanner in = new Scanner(System.in);
        String usrChoice = "";
        System.out.println("Enter your choice: Rock (press 1), Paper (press 2) or Scissor (press 3): ");
        int u = in.nextInt();
        if (u == 1) {
            usrChoice = "Rock";
        } else if (
                u == 2) {
            usrChoice = "Paper";
        } else if (u == 3) {
            usrChoice = "Scissors";
        } else {
            System.out.println("You made a wrong choice!");
        }
        return usrChoice;
    }

    public static String compareResults() {
        String comp = computerChoice();
        String user = userChoice();
        if (comp == "Rock" && user == "Scissors") {
            System.out.println("The computer won!");
        } else if (user == "Rock" && comp == "Scissors") {
            System.out.println("You won!");
        } else if (comp == "Scissors" && user == "Paper") {
            System.out.println("The computer won!");
        } else if (user == "Scissors" && comp == "Paper") {
            System.out.println("You won!");
        } else if (comp == "Paper" && user == "Rock") {
            System.out.println("The computer won!");
        } else if (user == "Paper" && comp == "Rock") {
            System.out.println("You won!");
        }else if((user == "Rock" && comp == "Rock") ||
                (user == "Paper" || comp == "Paper") ||
                (user == "Scissors" && comp == "Scissors")){
            System.out.println("There is a tie!");
            }
        return"The game is over";
    }
}




