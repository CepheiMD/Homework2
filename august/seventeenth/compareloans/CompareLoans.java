package com.tekwill.homework.august.seventeenth.compareloans;

import java.util.Scanner;

public class CompareLoans   {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.println("Enter the amount loaned: ");
        int loanAmount = am.nextInt();
        System.out.println("Enter the period in years: ");
        int loanPeriod = am.nextInt();
        int loanPeriodInMonths = loanPeriod * 12;
        double monthlyPayment = 0.00;
        double totalPayment = 0.00;
        double i;
        System.out.printf("%s%20s%15s\n","Interest rate","Monthly payment","Total Payment");

        for (i = 5.0; i <= 8.0; i += 0.125) {
           double monthlyInterest = (double)i / 100 / 12;
            monthlyPayment = (double)(loanAmount * monthlyInterest * Math.pow((1 + monthlyInterest),loanPeriodInMonths))/ (Math.pow((1 + monthlyInterest),loanPeriodInMonths) - 1);
            totalPayment = monthlyPayment * loanPeriodInMonths;
            System.out.printf("%.3f%s%20.2f%20.2f\n", i,"%", monthlyPayment, totalPayment);
        }
    }
}