package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class operationTest {

    @Test
    void addition() {

        double expectedResult = 19;
        int a = 10;
        int b = 9;

        double actualResult = operation.addition(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void subtraction() {

        double expectedResult = 30;
        int a = 45;
        int b = 15;

        double actualResult = operation.subtraction(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void multiplication() {

        double expectedResult = 90;
        int a = 10;
        int b = 9;

        double actualResult = operation.multiplication(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void divison() {

        double expectedResult = 5;
        int a = 10;
        int b = 2;

        double actualResult = operation.divison(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void square() {

        double expectedResult = 25;
        int a = 5;

        double actualResult = operation.square(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void squareRoot() {

        double expectedResult = 10;
        int a = 100;

        double actualResult = operation.squareRoot(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void exponents() {



    }

    @org.junit.jupiter.api.Test
    void inverseNumber() {
    }

    @org.junit.jupiter.api.Test
    void inverseSign() {
    }
}