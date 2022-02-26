package com.zipcodewilmington.scientificcalculator;

public class Scientific {
    public static double getSin(Boolean isRadian,double number){
        double radian=number;
        if (isRadian == false) {
            radian = Math.toRadians(number);
        }
        return Math.sin(radian);
    }
    public static double getaSin(Boolean isRadian,double number){
        double radian=number;
        if (isRadian == false) {
            radian = Math.toRadians(number);
        }
        return Math.asin(radian);
    }
    public static double getCos(Boolean isRadian,double number){
        double radian=number;
        if (isRadian == false) {
            radian = Math.toRadians(number);
        }
        return Math.cos(radian);
    }
    public static double getaCos(Boolean isRadian,double number){
        double radian=number;
        if (isRadian == false) {
            radian = Math.toRadians(number);
        }
        return Math.acos(radian);
    }
    public static double getTan(Boolean isRadian,double number){
        double radian=number;
        if (isRadian == false) {
            radian = Math.toRadians(number);
        }
        return Math.tan(radian);
    }
    public static double getaTan(Boolean isRadian,double number){
        double radian=number;
        if (isRadian == false) {
            radian = Math.toRadians(number);
        }
        return Math.atan(radian);
    }
    public static Boolean changeTrigCycle(Boolean isRadian){
        if (isRadian){
            return false;
        }
        else {
            return true;
        }
    }
    public static Boolean changeTrig(Boolean isRadian, String changeTo) {
        if (changeTo.equalsIgnoreCase( "radians")) {
            if (isRadian){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (isRadian) {
                return false;
            } else
                return true;
        }
    }
    public static double getLog (double number){
        return Math.log10(number);
    }
    public static double getInverseLog(double number){
        return Math.pow(10,number);
    }
    public static double getNaturalLog(double number){
        return Math.log(number);
    }
    public static double getInverseNaturalLog (double number){
        return Math.exp(number);
    }
    public static Integer getFactorial(Integer number){
        int fac = 1;
        for (int i=1; i<=number;i++){
            fac *= i;
        }
        return fac;
    }
    public static double getAbs(double number){
        return Math.abs(number);
    }
    public static double cube(double number){
        return Math.pow(number, 3);
    }
    public static double mAdd(double storedValue, double current){
        return storedValue+current;
    }
    public static double mSubtract(double storeValue, double current){
        return storeValue-current;
    }
}
