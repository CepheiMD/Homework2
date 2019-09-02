package com.tekwill.homework.august.seventeenth.cancellationerrors;

public class CancellationErrors {
    public static void main(String[] args) {
        float resultRighToLeft = 0.0f;
        float resultLeftToRight = 0.0f;

        for (int n = 5000; n >= 1; n--) {
            resultRighToLeft += (float)1/n;
            System.out.println(resultRighToLeft);
        }

        for (int j = 1; j<=5000; j++){
            resultLeftToRight += (float)1/j;
            System.out.println(resultLeftToRight);
        }
        System.out.println(resultRighToLeft + " " + resultLeftToRight);
    }
}
