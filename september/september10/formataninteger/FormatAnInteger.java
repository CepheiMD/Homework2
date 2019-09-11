package com.tekwill.homework2.september.september10.formataninteger;

public class FormatAnInteger {
    static int countDigitsOfNumber = 0;
    public static String format(int number, int width){
        int numberForPrint = number;
        while(number > 0){
            number = number / 10;
            countDigitsOfNumber++;
            }
        for (; width - countDigitsOfNumber > 0; countDigitsOfNumber++) {
            System.out.print(0);

        }
       System.out.print(numberForPrint);

        return "";
    }
}
