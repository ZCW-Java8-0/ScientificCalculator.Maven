package com.zipcodewilmington.scientificcalculator;

public class Scientific {
    public static double getLog (double number){
        return Math.log10(number);
    }
    public static double getInverseLog(double number){
        return Math.pow(10,number);
    }
    public static double getNaturalLog(double number){
        return Math.log(number);
    }
    public static double getInverseNaturalLog (double number){
        return Math.exp(number);
    }
    public static Integer getFactorial(Integer number){
        int fac = 1;
        for (int i=1; i<=number;i++){
            fac *= i;
        }
        return fac;
    }
}
