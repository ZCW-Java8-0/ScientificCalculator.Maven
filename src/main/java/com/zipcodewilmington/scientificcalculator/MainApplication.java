package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    static double d = 0, e = 0, result = 0, mStorage=0;
    static Boolean isRadian= true;
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("[+ for addition] [- for subtraction] [* for multiplication]");
        Console.println("[/ for division] [sq for square] [sqrt for square root]");
        Console.println("[exp for exponents] [1/N for inverse number] [-N for inverse sign]");
        Console.println("Trig Function: sin, cos, tan, asin, acos, atan");
        Console.println("Logarithm function: log, ln, log-1, ln-1");
        Console.println("Memory Function: MS to store, MR for recall value, M+ to add to memory value");
        Console.println("Memory Function: M- to subtract from memory value");
        Console.println("! for Factorial, switchUnitsMode to change between radians and degrees");
        Console.println("Radians to switch to radians, Degrees to switch to degrees");
        Console.println("DisplayUnitsMode to check if in radians or degrees");
        Console.println("[Current for current number][Change to change current number][Clear for clear display] ");
        String s ="";

        boolean onOff = true;
        d = Console.getDoubleInput("Enter first number:");
        result = d;
        while (onOff) {
            s = Console.getStringInput("Enter requested operation: ");
            Console.println("The user input %s as the operation", s);
            switch (s) {
                case "+":
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.addition(d, e);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "-":
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.subtraction(d, e);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "*":
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.multiplication(d, e);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "/":
                    e = Console.getDoubleInput("Enter second number:");
                    if (e == 0) {
                        Console.println("Err");
                    } else {
                        result = operation.divison(d, e);
                        Console.println(Double.toString(result));
                        d = result;
                    }
                    break;
                case "sq":
                    result = operation.square(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "sqrt":
                    result = operation.squareRoot(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "exp":
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.exponents(d, e);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "1/N":
                    result = operation.inverseNumber(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "-N":
                    result = operation.inverseSign(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                //scientific methods
                case "MC":
                    mStorage=0;
                    break;
                case "MS":
                    mStorage=d;
                    break;
                case "M+":
                    mStorage=Scientific.mAdd(mStorage,d);
                    break;
                case "M-":
                    mStorage=Scientific.mSubtract(mStorage,d);
                    break;
                case "MR":
                    d=mStorage;
                    Console.println(Double.toString(result));
                    break;
                case "sin":
                    result=Scientific.getSin(isRadian, d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "cos":
                    result=Scientific.getCos(isRadian, d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "tan":
                    result=Scientific.getTan(isRadian, d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "asin":
                    result=Scientific.getaSin(isRadian, d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "acos":
                    result=Scientific.getaCos(isRadian, d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "atan":
                    result=Scientific.getaTan(isRadian, d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "log":
                    result=Scientific.getLog(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "ln":
                    result=Scientific.getNaturalLog(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "log-1":
                    result=Scientific.getInverseLog(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "ln-1":
                    result=Scientific.getInverseNaturalLog(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "!":
                    result=Scientific.getFactorial((int) d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "Absolute Value":
                    result=Scientific.getAbs(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "Cube":
                    result=Scientific.cube(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "Current":
                    currentNum();
                    Console.println(Double.toString(d));
                    break;
                case "Change": //not sure if it does what is suppose to do
                    setNum(d);
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "Clear":
                    result = 0;
                    Console.println(Double.toString(result));
                    d = Console.getDoubleInput("Enter new Number:");
                    break;
                case "Off":
                    onOff = false;
                    break;
                case "switchUnitsMode":
                    isRadian=Scientific.changeTrigCycle(isRadian);
                    break;
                case "Radians":
                case "Degrees":
                    isRadian=Scientific.changeTrig(isRadian,s);
                    break;
                case "DisplayUnitsMode":
                    if (isRadian)
                        Console.println("The calculator is set to Radians");
                    else
                        Console.println("The calculator is set to Degrees");
                    break;
                default:
                    Console.println("Please pick a valid command");
                    break;
            }
        }
    }
        // Set current number
        public static double setNum(double input){
        result = input;
            return input;
        }
        // Current number
        public static double currentNum(){
        return result;
        }
    }
