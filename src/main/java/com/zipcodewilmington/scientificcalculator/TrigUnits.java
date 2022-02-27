package com.zipcodewilmington.scientificcalculator;

public class TrigUnits {
    static boolean radians = true;
    static boolean degrees = false;

    public static void switchUnitsMode(){
        if (radians) {
            radians = false;
            degrees = true;
        } else {
            degrees = false;
            radians = true;
        }
    }
   public static void switchUnitsMode(String mode) {
        if (mode.toLowerCase().equals("radians")) {
            radians = true;
            degrees = false;
        } else if (mode.toLowerCase().equals("degrees")){
            degrees = true;
            radians = false;
        }
    }
}
