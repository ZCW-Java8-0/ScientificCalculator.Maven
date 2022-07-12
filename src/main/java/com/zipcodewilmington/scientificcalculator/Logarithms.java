package com.zipcodewilmington.scientificcalculator;

public class Logarithms {
    /**
     * @param number --> Accepts double as parameter to calculate log using base 10
     * @return -> returns the log of number base 10.
     */
    public static double log (double number){
        return Math.log10(number);
    }

    /**
     * @param x --> Accepts double as parameter to calculate inverse log using base 10
     * @return -> returns the inverse log of x base 10.
     */
    public static double invLog(double x){
        return Math.pow(10, x);
    }
    /**
     * @param number --> Accepts double as parameter to calculate log using natural base
     * @return -> returns the  log of x base e.
     */
    public static double natLog (double number){
        return Math.log(number);
    }

    /**
     * @param x --> Accepts double as parameter to calculate inverse log using natural base
     * @return -> returns the inverse log of x base e.
     */
    public static double invNatLog(double x) {
        return Math.pow(Math.E, x);
    }
}
