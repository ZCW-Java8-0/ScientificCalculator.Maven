package com.zipcodewilmington.scientificcalculator;

public class Logarithms {
    public static double log (double number){
        return Math.log10(number);
    }
    public static double invLog(double x){
        return Math.pow(10, x);
    }
    public static double natLog (double x){
        return Math.log(x);
    }
    public static double invNatLog(double x) {
        return Math.pow(Math.E, x);
    }
}
