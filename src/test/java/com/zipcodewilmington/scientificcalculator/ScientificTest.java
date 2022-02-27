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

        double expectedResult = 0.5235987755982989;
        double number = 0.5;
        boolean isRadian = true;

        double actualResult = Scientific.getaSin(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getaSinTest2() {

        double expectedResult = 1.5707963267948966;
        double number = 1;
        boolean isRadian = true;

        double actualResult = Scientific.getaSin(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getCosTest1() {

        double expectedResult = 0.43837114678907746;
        double number = 64;
        boolean isRadian = false;

        double actualResult = Scientific.getCos(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getCosTest2() {

        double expectedResult = 0.39185723042955;
        double number = 64;
        boolean isRadian = true;

        double actualResult = Scientific.getCos(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getaCosTest1() {

        double expectedResult = 1.5707963267948966;
        double number = 0;
        boolean isRadian = true;

        double actualResult = Scientific.getaCos(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getaCosTest2() {

        double expectedResult = 0.45102681179626236;
        double number = 0.9;
        boolean isRadian = true;

        double actualResult = Scientific.getaCos(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getTanTest1() {

        double expectedResult = 11.430052302761348;
        double number = 85;
        boolean isRadian = false;

        double actualResult = Scientific.getTan(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getTanTest2() {

        double expectedResult = 0.17887017243876716;
        double number = 85;
        boolean isRadian = true;

        double actualResult = Scientific.getTan(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getaTanTest1() {

        double expectedResult = 1.4056476493802699;
        double number = 6;
        boolean isRadian = true;

        double actualResult = Scientific.getaTan(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getaTanTest2() {

        double expectedResult = 1.2490457723982544;
        double number = 3;
        boolean isRadian = true;

        double actualResult = Scientific.getaTan(isRadian, number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void changeTrigCycleTest1() {

        boolean expectedResult = false;
        boolean isRadian = true;

        boolean actualResult = Scientific.changeTrigCycle(isRadian);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void changeTrigCycleTest2() {

        boolean expectedResult = true;
        boolean isRadian = false;

        boolean actualResult = Scientific.changeTrigCycle(isRadian);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getLogTest1() {

        double expectedResult = 1;
        double number = 10;

        double actualResult = Scientific.getLog(number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getLogTest2() {

        double expectedResult = 1.3979400086720377;
        double number = 25;

        double actualResult = Scientific.getLog(number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getInverseLogTest1() {

        double expectedResult = 100;
        double number = 2;

        double actualResult = Scientific.getInverseLog(number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getInverseLogTest2() {

        double expectedResult = 3.1622776601683795;
        double number = 0.5;

        double actualResult = Scientific.getInverseLog(number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getNaturalLogTest1() {

        double expectedResult = 2.0794415416798357;
        double number = 8;

        double actualResult = Scientific.getNaturalLog(number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getNaturalLogTest2() {

        double expectedResult = 3.5263605246161616;
        double number = 34;

        double actualResult = Scientific.getNaturalLog(number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getInverseNaturalLogTest1() {

        double expectedResult = 2.718281828459045;
        double number = 1;

        double actualResult = Scientific.getInverseNaturalLog(number);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void getInverseNaturalLogTest2() {

        double expectedResult = 2980.9579870417283;
        double number = 8;

        double actualResult = Scientific.getInverseNaturalLog(number);

        assertEquals(expectedResult, actualResult);

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