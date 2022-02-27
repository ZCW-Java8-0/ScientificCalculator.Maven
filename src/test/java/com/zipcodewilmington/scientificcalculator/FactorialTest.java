package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial() {
        Factorial testFact = new Factorial();
        assertEquals(24, testFact.factorial(4));
    }
}