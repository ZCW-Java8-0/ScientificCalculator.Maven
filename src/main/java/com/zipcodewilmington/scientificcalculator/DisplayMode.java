package com.zipcodewilmington.scientificcalculator;

public class DisplayMode {
    static boolean binary = false;
    static boolean octal = false;
    static boolean decimal = false;
    static boolean hexadecimal = false;
    static String displayMode = "decimal";

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


    public static void switchDisplayMode(String mode){
        displayMode = mode.toLowerCase();
        if(displayMode.equals("binary")){
            binary = true;
        } else if (displayMode.equals("octal")){
            octal = true;
        } else if (displayMode.equals("decimal")){
            decimal = true;
        } else if (displayMode.equals("hexadecimal")){
            hexadecimal = true;
        }

    }
}
