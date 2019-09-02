package com.tekwill.homework.august.twentyfourth.displaycharacters;

public class DisplayCharacters {

    public static void printChars(char ch1, char ch2, int numberPerLine){

        for (int ctr = 1; ch1 <= ch2; ctr++, ch1++) {
            System.out.print(ch1 + " ");
                if(ctr % numberPerLine == 0){
                    System.out.println("");
                }
            //System.out.print("\n");
             }
    }
}
