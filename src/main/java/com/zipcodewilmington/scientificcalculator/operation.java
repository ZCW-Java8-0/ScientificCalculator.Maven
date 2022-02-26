package com.zipcodewilmington.scientificcalculator;

public class operation {
// START OF BASIC OPERATIONS
    public static double addition(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static double subtraction(double a, double b) {
        double subtract = a - b;
        return subtract;
    }

    public static double multiplication(double a, double b) {
        double multiply = a * b;
        return multiply;
    }

    public static double divison(double a, double b) {
        double divide = 0;
        if (b == 0) System.out.println("Err");
        else {
            divide = a / b;
        }
        return divide;

    }

    public static double square(double a) {
        double squared = a * a;
        return squared;
    }

    public static double squareRoot(double a) {
        double squareR = Math.sqrt(a);
        return squareR;
    }

    public static double exponents(double a, double b) {
        double exponent = Math.pow(a, b);
        return exponent;
    }
    public static double inverseNumber(double a) {
        double inverseN = 1/a;
        return inverseN;
    }
    public static double inverseSign(double a){
        double inverseS = a * -1;
        return inverseS;
    }
//END OF BASIC OPERATIONS
}
