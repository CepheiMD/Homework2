package com.tekwill.homework2.august.august31.pentagonalnumber;

public class PentagonalNumbers {
    public static int pentagonalNumber(int j){
        int result = 0;
        for (int n = 1; n <=j; n++){
            result = (n*(3*n-1))/2;
            System.out.printf("%-6d",result);
            if(n % 10 ==0)
                System.out.println();
        }
        return result;

    }
}
