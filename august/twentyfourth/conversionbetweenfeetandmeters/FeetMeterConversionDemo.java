package com.tekwill.homework.august.twentyfourth.conversionbetweenfeetandmeters;

public class FeetMeterConversionDemo {
    public static void main(String[] args) {
        double i, j;
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Feet","Meter","|","Meters","Feet");

        for (i = 1.0, j =20.0; i <= 10.0 || j <= 20.0; i++, j+=5) {
            System.out.printf("%-10.1f%-10.3f%-10s%-10.1f%-10.3f\n",i,
                    FeetMeterConversion.footToMeter(i),"|",
                    j,FeetMeterConversion.meterToFeet(j));
        }
    }
}
