package com.zipcodewilmington.scientificcalculator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Display {
    /**
     * This returns the current state of calculator which is 0.0
     */

    double state=0.0;

    public void setState ( double state ) {
        this.state = state;
    }

    public double getStateORShowDisplay(){
        return this.state;
    }

    public void clearDisplay(){
         this.state=0.0;
    }


      public double clearError(){
        return this.state=0.0;
      }

}
