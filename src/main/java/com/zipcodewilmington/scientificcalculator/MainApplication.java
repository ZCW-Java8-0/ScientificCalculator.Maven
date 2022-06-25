package com.zipcodewilmington.scientificcalculator;

/**
 * Author: Jason Lee, Joseph Kowalski, Wei Zheng
 */
public class MainApplication {
    public static double current = 0, mStorage=0;
    public static Boolean isRadian= true, onOff = true;
    public static String operation = "", displayType ="Decimal";
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("[+ for addition] [- for subtraction] [* for multiplication]");
        Console.println("[/ for division] [sq for square] [sqrt for square root]");
        Console.println("[exp for exponents] [1/N for inverse number] [-N for inverse sign]");
        Console.println("Trig Function: sin, cos, tan, asin, acos, atan");
        Console.println("Logarithm function: log, ln, log-1, ln-1");
        Console.println("Memory Function: MS to store, MR for recall value, M+ to add from memory value");
        Console.println("Memory Function: M- to subtract from memory value");
        Console.println("! for Factorial, switchUnitsMode to change between radians and degrees");
        Console.println("Radians to switch to radians, Degrees to switch to degrees");
        Console.println("DisplayUnitsMode to check if in radians or degrees");
        Console.println("switchDisplayMode cycle Display mode between Binary, Octal, Decimal, and Hexadecimal");
        Console.println("Typing the name of specific display type from above would change to that display mode");
        Console.println("Note: Inputs should still be in decimal format");
        Console.println("Use 'Current Display type' to check current display mode status");
        Console.println("[Current for current number][Change to change current number][Clear for clear display] ");
        Console.println("[Off to turn calculator off]");
        current = Console.getDoubleInput("Enter initial number:");
        while (onOff) {
            operation = Console.getStringInput("Enter requested operation: ");
            Console.println("The user input %s as the operation", operation);
            Reader.reader();
            Console.println("Current:"+Reader.display());
            }
        }
    }
