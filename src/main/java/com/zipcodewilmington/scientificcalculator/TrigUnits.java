package com.zipcodewilmington.scientificcalculator;

public class TrigUnits {
    static boolean radians = true;
    static boolean degrees = false;

    /**
     * Cycles through trig units and updates corresponding fields.
     */

    public static void switchUnitsMode(){
        if (radians) {
            radians = false;
            degrees = true;
        } else {
            degrees = false;
            radians = true;
        }
    }
    /**
     * @param mode --> takes a mode and toggles the corresponding field.
     * Selection alternative to cycling through trig units.
     */
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
