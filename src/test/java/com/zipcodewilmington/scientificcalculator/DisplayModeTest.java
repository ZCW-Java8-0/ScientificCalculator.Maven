package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayModeTest {
  DisplayMode disMode=new DisplayMode();
  BasicCalculator test=new BasicCalculator();

    @Test
    void switchDisplayMode () {
        boolean exp=true;
        DisplayMode.switchDisplayMode();
        boolean output= DisplayMode.binary;

        Assertions.assertTrue(output);
    }

    @Test
    void changeDisplayTest(){
        BasicCalculator test=new BasicCalculator();
        double  actualOutput=test.basicOperations("/", 10,2);
        DisplayMode.changeDisplay();
        DisplayMode.switchDisplayMode();
        double  actualOutput1=test.basicOperations("/", 10,2);
        DisplayMode.changeDisplay();
    }
}