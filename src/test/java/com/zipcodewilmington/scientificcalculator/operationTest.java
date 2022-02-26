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
    }

    @org.junit.jupiter.api.Test
    void divison() {
    }

    @org.junit.jupiter.api.Test
    void square() {
    }

    @org.junit.jupiter.api.Test
    void squareRoot() {
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