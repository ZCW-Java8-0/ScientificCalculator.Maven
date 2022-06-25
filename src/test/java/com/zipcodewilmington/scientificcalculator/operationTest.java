package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class operationTest {

    @Test
    void additionTest1() {

        double expectedResult = 19;
        int a = 10;
        int b = 9;

        double actualResult = Operation.addition(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void additionTest2() {

        double expectedResult = 24;
        int a = -35;
        int b = 59;

        double actualResult = Operation.addition(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void subtractionTest1() {

        double expectedResult = 30;
        int a = 45;
        int b = 15;

        double actualResult = Operation.subtraction(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void subtractionTest2() {

        double expectedResult = -5;
        int a = 8;
        int b = 13;

        double actualResult = Operation.subtraction(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void multiplicationTest1() {

        double expectedResult = 90;
        int a = 10;
        int b = 9;

        double actualResult = Operation.multiplication(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void multiplicationTest2() {

        double expectedResult = -7;
        int a = -1;
        int b = 7;

        double actualResult = Operation.multiplication(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void divisonTest1() {

        double expectedResult = 5;
        int a = 10;
        int b = 2;

        double actualResult = Operation.divison(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void divisonTest2() {

        double expectedResult = 0.15;
        int a = 6;
        int b = 40;

        double actualResult = Operation.divison(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void squareTest1() {

        double expectedResult = 25;
        int a = 5;

        double actualResult = Operation.square(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void squareTest2() {

        double expectedResult = 81;
        int a = -9;

        double actualResult = Operation.square(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void squareRootTest1() {

        double expectedResult = 10;
        int a = 100;

        double actualResult = Operation.squareRoot(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void squareRootTest2() {

        double expectedResult = 2;
        int a = 4;

        double actualResult = Operation.squareRoot(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void exponentsTest1() {

        double expectedResult = 117649;
        int a = 7;
        int b = 6;

        double actualResult = Operation.exponents(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void exponentsTest2() {

        double expectedResult = -125;
        int a = -5;
        int b = 3;

        double actualResult = Operation.exponents(a,b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void inverseNumberTest1() {

        double expectedResult = 0.2;
        int a = 5;

        double actualResult = Operation.inverseNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void inverseNumberTest2() {

        double expectedResult = -1.25;
        double a = -0.8;

        double actualResult = Operation.inverseNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void inverseSignTest1() {

        double expectedResult = 7;
        int a = -7;

        double actualResult = Operation.inverseSign(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void inverseSignTest2() {

        double expectedResult = -67;
        int a = 67;

        double actualResult = Operation.inverseSign(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}