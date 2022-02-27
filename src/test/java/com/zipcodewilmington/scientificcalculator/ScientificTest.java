package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

class ScientificTest {

    @Test
    void getSinTest1() {

        double expectedResult = 0.052335956242943835;
        double number = 3;
        boolean isRadian = false;

        double actualResult = Scientific.getSin(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getSinTest2() {

        double expectedResult = 0.1411200080598672;
        double number = 3;
        boolean isRadian = true;

        double actualResult = Scientific.getSin(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getaSinTest1() {

        double expectedResult = 0.1411200080598672;
        double number = 3;
        boolean isRadian = false;

        double actualResult = Scientific.getaSin(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getCos() {
    }

    @Test
    void getaCos() {
    }

    @Test
    void getTan() {
    }

    @Test
    void getaTan() {
    }

    @Test
    void changeTrigCycle() {
    }

    @Test
    void changeTrig() {
    }

    @Test
    void getLog() {
    }

    @Test
    void getInverseLog() {
    }

    @Test
    void getNaturalLog() {
    }

    @Test
    void getInverseNaturalLog() {
    }

    @Test
    void getFactorial() {
    }

    @Test
    void getAbs() {
    }

    @Test
    void cube() {
    }

    @Test
    void mAdd() {
    }

    @Test
    void mSubtract() {
    }
}