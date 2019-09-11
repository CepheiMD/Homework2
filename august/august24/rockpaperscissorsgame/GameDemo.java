package com.tekwill.homework2.august.august24.rockpaperscissorsgame;

public class GameDemo {
    public static void main(String[] args) {
        String compResult = RockPaperScissorsGame.computerChoice();
        String userResult = RockPaperScissorsGame.userChoice();
        System.out.println("Computer made his choice!");

        System.out.println(RockPaperScissorsGame.compareResults());
        System.out.println("Computer choice is: " + compResult);
        System.out.println("Your choice is: " + userResult);
    }
}
