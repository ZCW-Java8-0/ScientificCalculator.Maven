package com.zipcodewilmington.scientificcalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before; //not sure about this
class MainApplicationTest {

    @org.junit.jupiter.api.Test
    void main() {
        newCalculatorTest = new ScientificCalculator();


        public void testAddition () {
            int addTestA = 10;
            int addTestB = 20;
            int expectedAddition = 30;

            int additionResult = newCalculatorTest.add(addTestA, addTestB);
            Assert.AssertEquals(expectedAddition, additionResult);
        }
        public void testSubtraction () {
            int subtractionTestA = 30;
            int subtractionTestB = 20;
            int expectedSubtraction = 10;

            int subtractionResult = newCalculatorTest.subtract(subtractionTestA, subtractionTestB);
            Assert.AssertEquals(expectedSubtraction, subtractionResult);
        }
        public void testMultiply () {
            int multiplyTestA = 10;
            int multiplyTestB = 20;
            int expectedMultiply = 200;

            int multiplyResult = newCalculatorTest.multiply(multiplyTestA, multiplyTestB);
            Assert.AssertEquals(expectedMultiply, multiplyResult);
        }
        public void testDivision () {
            int divisionTestA = 20;
            int divisionTestB = 10;
            int expectedDivision = 2;

            int divisionResult = newCalculatorTest.division(divisionTestA, divisionTestB);
            Assert.AssertEquals(expectedDivision, divisionResult);
        }
        public void testSquare () {
            int squaredNumberA = 4;
            int squaredPowerB = 2;
            int expectedSquareExpected = 16;

            int squaredResult = newCalculatorTest.square(squaredNumberA, squaredPowerB);
            Assert.AssertEquals(expectedSquareExpected, squaredResult);
        }
        public void testSquareRoot () {
            int squareRootTestA = 4;
            int squareRootTestB = 2;
            int expectedSquareRoot = 2;

            int squareRootResult = newCalculatorTest.squareRoot(squareRootTestA, squareRootTestB);
            Assert.AssertEquals(expectedSquareRoot, squareRootResult);
        }
        public void testXtotheY () {
            int xForTheY = 4;
            int yForTheX = 2;
            int expectedVariableProductResult = 16;

            int variableProductResult = newCalculatorTest.variableExponent(xForTheY, yForTheX);
            Assert.AssertEquals(expectedVariableProductResult, variableProductResult);
        }
        public void inverseX () {
            int inverseXValue = 5;
            int expectedInverseResult = 1/5;

            int inverseResult = newCalculatorTest.inverseVaule(inverseXValue);
            Assert.AssertEquals(expectedInverseResult, inverseResult);
        }
    }
}
