package com.tekwill.homework2.august.august31.sumthedigitsinaninteger;


public class SumDigitsInAnInteger {
    public static int sumDigits(long n) {
        int sum = 0;
        int i;
        while (n > 0){
            i = (int)n%10;
            sum += i;
            n /=10;
        }
        System.out.println(sum);
        return sum;
    }
}
