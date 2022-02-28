package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    public double output;

    public double sine(double num1) {
        output = Math.sin(Math.toRadians(num1));
        return output;
    }

    public double cosine(double num1) {
        output = Math.cos(Math.toRadians(num1));
        return output;
    }

    public double tangent(double num1) {
        output = Math.tan(Math.toRadians(num1));
        return output;
    }

    public double inverseSine(double num1) {
        output = (Math.asin(num1) * (180/Math.PI));
        return output;
    }

    public double inverseCosine(double num1) {
        output = (Math.acos(num1) * (180/Math.PI));
        return output;
    }

    public double inverseTangent(double num1) {
        output = (Math.atan(num1) * (180/Math.PI));
        return output;
    }

    public double naturalLog(double num1) {
        output = Math.log(num1);
        return output;
    }

    public double log(double num1) {
        output = Math.log10(num1);
        return output;

    }

    public double inverseLn(double num1) {
        output = Math.exp(num1);
        return output;
    }

    public double inverseLog(double num1) {
        output = Math.pow(10, num1);
        return output;
    }

    public double cubeRoot(double num1) {
        output = Math.cbrt(num1);
        return output;
    }


    public double absoluteValue(double num1) {
        output = Math.abs(num1);
        return output;
    }

    public double factorial(double num1) {
        output = 1;
        if(num1 < 0)  {
            System.out.println("Can't find the factorial of a negative number");
        } else {
            for(int i = 1; i <= num1; i++) {
                output = output * i;
            }
        }
        return output;
    }
}





































