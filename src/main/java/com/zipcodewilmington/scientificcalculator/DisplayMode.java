package com.zipcodewilmington.scientificcalculator;

public class DisplayMode {
    static boolean binary = false;
    static boolean octal = false;
    static boolean decimal = true;
    static boolean hexadecimal = false;
    static String displayMode = "decimal";

    /**
     * Cycles through display modes and updates the corresponding fields.
     */
    public static void switchDisplayMode(){
        if (!binary && !octal && !decimal && !hexadecimal){
            displayMode = "binary";
            binary = true;
        } else if (binary) {
            displayMode = "octal";
            binary = false;
            octal = true;
        } else if (octal) {
            displayMode = "decimal";
            octal = false;
            decimal = true;
        } else if (decimal) {
            displayMode = "hexadecimal";
            decimal = false;
            hexadecimal = true;
        } else if (hexadecimal) {
            displayMode = "binary";
            hexadecimal = false;
            binary = true;
        }

    }

    /**
     * @param mode --> Accepts String as a parameter and updates the corresponding DisplayMode fields.
     * The selection alternative to cycling through display modes.
     */
    public static void switchDisplayMode(String mode){
        displayMode = mode.toLowerCase();
        if(displayMode.equals("binary")){
            binary = true;
            octal = false;
            decimal = false;
            hexadecimal = false;
        } else if (displayMode.equals("octal")){
            octal = true;
            binary = false;
            decimal = false;
            hexadecimal = false;
        } else if (displayMode.equals("decimal")){
            decimal = true;
            binary = false;
            octal = false;
            hexadecimal = false;
        } else if (displayMode.equals("hexadecimal")){
            hexadecimal = true;
            binary = false;
            octal = false;
            decimal = false;
        }
        DisplayMode.changeDisplay();

    }

    /**
     * Method for changing result display mode. Convert double to long and then convert long
     * to corresponding display.
     * References: https://stackoverflow.com/questions/22644079/how-to-convert-a-double-number-to-binary-number-in-java
     *             Tested with: https://www.binaryconvert.com/convert_double.html?decimal=053
     */
    public static void changeDisplay() {
        long toBits = Double.doubleToRawLongBits(BasicCalculator.result);
        if (binary){
            System.out.println(Long.toBinaryString(toBits));
        } else if (octal) {
            System.out.println(Long.toOctalString(toBits));
        } else if (hexadecimal) {
            System.out.println(Long.toHexString(toBits));
        } else if (decimal) {
            System.out.println(BasicCalculator.result);
        }


    }
}
