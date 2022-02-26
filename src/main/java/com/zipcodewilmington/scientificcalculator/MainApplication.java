package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    static double d = 0;
    static double e = 0;
    static double result = 0;

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("[+ for addition] [- for subtraction] [* for multiplication]");
        Console.println("[/ for division] [sq for square] [sqrt for square root]");
        Console.println("[exp for exponents] [1/N for inverse number] [-N for inverse sign]");
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
                case "Current":
                    currentNum();
                    Console.println(Double.toString(result));
                    d = result;
                    break;
                case "Change":
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
