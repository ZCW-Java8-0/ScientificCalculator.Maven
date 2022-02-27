package com.zipcodewilmington.scientificcalculator;

public class Factorial {
    /**
     * @param n --> Accepts int as parameter to calculate factorial of
     * @return -> returns the factorial of the input. If n is less than zero throws error.
     */
    public static int factorial (int n){
        if (n < 0){
            throw new ArithmeticException("Factorial must be either zero or a positive integer.");
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
       return (n * factorial(n-1));
    }
}
