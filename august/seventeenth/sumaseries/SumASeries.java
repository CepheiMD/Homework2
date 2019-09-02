package com.tekwill.homework.august.seventeenth.sumaseries;

public class SumASeries {
    public static void main(String[] args) {

    float result = 0.0f;
    int i;
    int j;

    for(i = 1, j = 3;i <= 97; i +=2, j+=2){
        result += (float)i/j;
        }
        System.out.printf("%.4f",result);
    }
}
