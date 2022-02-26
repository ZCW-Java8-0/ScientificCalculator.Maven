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
        Console.println("[Clear for clear display] ");
        String s = Console.getStringInput("Enter requested operation: ");
        //Integer i = Console.getIntegerInput("Enter an integer");
        //Double d = Console.getDoubleInput("Enter a double.");
        //Double e = Console.getDoubleInput2("Enter a double");

        Console.println("The user input %s as the operation", s);
        //Console.println("The user input %f as a integer", i);
        //Console.println("The user input %s as the first number", d);
        //Console.println("The user input %s as the second number", e);

            switch (s) {
                case"+":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.addition(d, e);
                    Console.println(Double.toString(result));
                    break;
                case"-":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.subtraction(d, e);
                    Console.println(Double.toString(result));
                    break;
                case"*":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.multiplication(d, e);
                    Console.println(Double.toString(result));
                    break;
                case"/":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput("Enter second number:");
                    result = operation.divison(d, e);
                    Console.println(Double.toString(result));
                    break;
                case"sq":
                    d = Console.getDoubleInput( "Enter number to square:");
                    result = operation.square(d);
                    Console.println(Double.toString(result));
                    break;
                case"sqrt":
                    d = Console.getDoubleInput( "Enter number to square root:");
                    result = operation.squareRoot(d);
                    Console.println(Double.toString(result));
                    break;
                case"exp":
                    d = Console.getDoubleInput( "Enter first number:");
                    e = Console.getDoubleInput( "Enter second number:");
                    result = operation.exponents(d,e);
                    Console.println(Double.toString(result));
                    break;
                case"1/N":
                    d = Console.getDoubleInput( "Enter number to inverse:");
                    result = operation.inverseNumber(d);
                    Console.println(Double.toString(result));
                    break;
                case"-N":
                    d = Console.getDoubleInput( "Enter number to inverse sign:");
                    result = operation.inverseSign(d);
                    Console.println(Double.toString(result));
                    break;
                case"current":
                    currentNum();
                    Console.println(Double.toString(result));
                    break;
                case"change":
                    d = Console.getDoubleInput( "Enter number to change display to:");
                    setNum(d);
                    Console.println(Double.toString(result));
                    break;
                case"Clear":
                    result = 0;
                    Console.println(Double.toString(result));
                    break;
                default:
                    Console.println("Please pick a valid command");
                    break;
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