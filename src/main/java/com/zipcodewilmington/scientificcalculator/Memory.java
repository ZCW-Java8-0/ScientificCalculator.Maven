package com.zipcodewilmington.scientificcalculator;

public class Memory {
    static double memoryVal = 0;

     /** Add the currently displayed value to the value stored in memory and update the display.
     */
     public static void MAddKey() {
         memoryVal = BasicCalculator.result + memoryVal;
         System.out.println(memoryVal);
     }

    /**
     * Reset memory
     */
           public static void MCKey(){
               memoryVal = 0;
           }

    /**
     * Recall the current value from memory to the display *
     */
    public static void MRCKey() {
        System.out.println(memoryVal);
    }

}
