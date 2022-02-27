package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MainApplicationTest {

//    void main() { //main method not needed for test class
        BasicCalculator test = new BasicCalculator();
        Trigonometry test2 = new Trigonometry();
        Logarithms test3 = new Logarithms();
        Factorial test4 = new Factorial();

//        @Test
//        void factorialNegativeNumber () {
//            String expectedFactorialNegativeNumber = "Factorial must be either zero or a positive integer.";
//            Integer factorialNegativeNumber = test4.factorial(-1);
//            Assertions.assertEquals(expectedFactorialNegativeNumber,factorialNegativeNumber);
//

        @Test
         void additionTest () {
            double expectedAddition = 30;
            double additionResult = test.basicOperations("+",10,20);
//            int additionResult = newCalculatorTest.add(addTestA, addTestB);
            Assertions.assertEquals(expectedAddition, additionResult);
        //Change for all tests - basicoperations for all basic tests except inverse
        }
        @Test
        void subtractionTest () {
            double expectedSubtraction = 20;
            double subtractionResult = test.basicOperations("-",40,20);
            Assertions.assertEquals(expectedSubtraction,subtractionResult);
        }
        @Test
        void multiplicationTest () {
            double expectedMultiplication = 30;
            double multiplicationResult = test.basicOperations("*",10,3);
            Assertions.assertEquals(expectedMultiplication,multiplicationResult);
        }
        @Test
        void divisionTest () {
            double expectedDivision = 10;
            double divisionResult = test.basicOperations("/",30,3);
            Assertions.assertEquals(expectedDivision, divisionResult);
        }
        @Test
        void divideByZeroTest () {
            String expectedDivideByZeroString = "Infinity";
            double expectedDivideByZeroDouble = Double.parseDouble(expectedDivideByZeroString);
            double divideByZeroResult = test.basicOperations("/",20,0);
            Assertions.assertEquals(expectedDivideByZeroDouble,divideByZeroResult);
        }
        @Test
        void inverseTest () {
            String expectedInverse = "1/30.0";
            String inverseResult = test.getInverseOfNumber(30);
            Assertions.assertEquals(expectedInverse, inverseResult);
        }
        @Test
        void squareTest () {
            double expectedSquareValue = 16.0;
            double squareResult = test.basicOperations("SQ", 4,0);
            Assertions.assertEquals(expectedSquareValue,squareResult);
        }
        @Test
        void squareRootTest () {
            double expectedSquareRoot = 4.0;
            double squareRoot = test.basicOperations("SQR",16,0);
            Assertions.assertEquals(expectedSquareRoot,squareRoot);
        }
    @Test
    void sineRadiansTest () {
        double expectedSineRadians =  0.49999999999999994;
        double sineRadiansResult = test2.sine((Math.PI) / 6);
        Assertions.assertEquals(expectedSineRadians,sineRadiansResult);
    }
    @Test
    void sineDegreesTest () {
        double expectedSineDegrees = 0.8509035245341184;
        double sineDegreesTest = test2.sine(45);
        Assertions.assertEquals(expectedSineDegrees,sineDegreesTest);
    }
    @Test
    void cosineRadiansTest () {
        double expectedCosineRadians = 0.8660254037844387;
        double cosineRadiansResult = test2.cosine((Math.PI)/6);
        Assertions.assertEquals(expectedCosineRadians,cosineRadiansResult);
    }
    @Test
    void cosineDegreesTest () {
        double expectedCosineDegrees = 0.15425144988758405;
        double cosineDegreesResult = test2.cosine(30);
        Assertions.assertEquals(expectedCosineDegrees,cosineDegreesResult);
    }
    @Test
    void tangentRadiansTest () {
        double expectedTangentRadians = 1.7320508075688767;
        double tangentRadiansResult = test2.tangent((Math.PI)/3);
        Assertions.assertEquals(expectedTangentRadians,tangentRadiansResult);
    }
    @Test
    void tangentDegreesTest () {
        double expectedTangentDegrees = 0.320040389379563;
        double tangentDegreesResult = test2.tangent(60);
        Assertions.assertEquals(expectedTangentDegrees, tangentDegreesResult);
    }
    @Test
    void inverseSineTest () {
        double expectedInverseSineRatio = 0.9272952180016123;
        double inverseSineResult = test2.invSine(4,5);
        Assertions.assertEquals(expectedInverseSineRatio, inverseSineResult);
    }
    @Test
    void inverseCosineTest () {
        double expectedInverseCosineRatio = 0.9272952180016123;
        double inverseCosineResult = test2.invCosine(3,5);
        Assertions.assertEquals(expectedInverseCosineRatio,inverseCosineResult);
    }
    @Test
    void inverseTangentResult () {
        double expectedInverseTangentRatio = 0.6435011087932844;
        double inverseTangentResult = test2.invTangent(3,4);
        Assertions.assertEquals(expectedInverseTangentRatio,inverseTangentResult);
    }
    @Test
    void logTest () {
        double expectedLogTest = 1;
        double logResult = test3.log(10);
        Assertions.assertEquals(expectedLogTest,logResult);
    }
    @Test
    void invLog () {
        double expectedInverseTest = 10;
        double invLogResult = test3.invLog(1);
        Assertions.assertEquals(expectedInverseTest, invLogResult);
    }
    @Test
    void natLog () {
        double expectedNatLog = 1.0986122886681098;
        double natLogResult = test3.natLog(3);
        Assertions.assertEquals(expectedNatLog,natLogResult);
    }
    @Test
    void invNatLog () {
        double expectedInvLog = 3;
        double invNatLogResult = test3.invNatLog(1.0986122886681098);
        Assertions.assertEquals(expectedInvLog,invNatLogResult);

    }
    @Test
    void factorialTestZero () {
        double expectedFactorialZero = 1;
        double factorialZeroResult = test4.factorial(0);
        Assertions.assertEquals(expectedFactorialZero, factorialZeroResult);
    }
    @Test
    void factorialTestOne () {
        double expectedFactorialOne = 1;
        double factorialOneResult = test4.factorial(1);
        Assertions.assertEquals(expectedFactorialOne, factorialOneResult);
    }
    @Test
    void factorialTestAboveOne () {
        double expectedFactorialTest = 120;
        double factorialResult = test4.factorial(5);
        Assertions.assertEquals(expectedFactorialTest,factorialResult);
    }
//        @Test
//        public void testSubtraction () {
//            int subtractionTestA = 30;
//            int subtractionTestB = 20;
//            int expectedSubtraction = 10;
//
////            int subtractionResult = newCalculatorTest.subtract(subtractionTestA, subtractionTestB);
//            Assertions.assertEquals(expectedSubtraction, subtractionResult);
//        }
//        @Test
//        public void testMultiply () {
//            int multiplyTestA = 10;
//            int multiplyTestB = 20;
//            int expectedMultiply = 200;
//
//            int multiplyResult = newCalculatorTest.multiply(multiplyTestA, multiplyTestB);
//            Assertions.AssertEquals(expectedMultiply, multiplyResult);
//        }
//        @Test
//        public void testDivision () {
//            int divisionTestA = 20;
//            int divisionTestB = 10;
//            int expectedDivision = 2;
//
//            int divisionResult = newCalculatorTest.division(divisionTestA, divisionTestB);
//            Assert.AssertEquals(expectedDivision, divisionResult);
//        }
//        @Test
//        public void testSquare () {
//            int squaredNumberA = 4;
//            int squaredPowerB = 2;
//            int expectedSquareExpected = 16;
//
//            int squaredResult = newCalculatorTest.getSquare(squaredNumberA, squaredPowerB);
//            Assert.AssertEquals(expectedSquareExpected, squaredResult);
//        }
//        @Test
//        public void testSquareRoot () {
//            int squareRootTestA = 4;
//            int squareRootTestB = 2;
//            int expectedSquareRoot = 2;
//
//            int squareRootResult = newCalculatorTest.getSquareRoot(squareRootTestA, squareRootTestB);
//            Assert.AssertEquals(expectedSquareRoot, squareRootResult);
//        }
//        @Test
//        public void testXtotheY () {
//            int xForTheY = 4;
//            int yForTheX = 2;
//            int expectedVariableProductResult = 16;
//
//            int variableProductResult = newCalculatorTest.getExponentiation(xForTheY, yForTheX);
//            Assert.AssertEquals(expectedVariableProductResult, variableProductResult);
//        }
//        @Test
//        public void testInverseX () {
//            int inverseXValue = 5;
//            double expectedInverseResult = 1/5;
//
//            int inverseResult = newCalculatorTest.getInverseOfNumber(inverseXValue);
//            Assert.AssertEquals(expectedInverseResult, inverseResult);
//        }
//        @Test
//        public void testSineX () {
//            double testSineValueRadians = 0.19 * Math.PI;
//            double expectedSineX = 83/144;
//
//            double sineResult = newCalculatorTest.sine(sineValueRadians);
//            Assert.AssertEquals(expectedSineX, sineResult);
//        }
//        @Test
//        public void testCosineX () {
//            double testCosineValueRadians = 0.19 * Math.PI;
//            double expectedCosineX = Math.sqrt(3) / 2;
//
//            double cosineResult = newCalculatorTest.cosine(cosineValueRadians);
//            Assert.AssertEquals(expectedCosineX, cosineResult);
//        }
//        @Test
//        public void testTangentX () {
//            double testTangentValueRadians = Math.PI / 6;
//            double expectedTangentX = Math.sqrt(3) / 3;
//
//            double tangentResult = newCalculatorTest.tangent(testTangentValueRadians);
//            Assert.AssertEquals(expectedTangentX, tangentResult);
//        }
//        @Test
//        public void testFactorial() {
//            double testFactorialValue = 5;
//            double expectedFactorialResult = 120;
//
//            double factorialResult = newCalculatorTest.factorial(testFactorialValue);
//            Assert.AssertEquals(expectedFactorialResult, factorialResult);
//
//        }
    }

