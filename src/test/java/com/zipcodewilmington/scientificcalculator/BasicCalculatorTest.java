package com.zipcodewilmington.scientificcalculator;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Scanner;


public class BasicCalculatorTest {

    BasicCalculator test=new BasicCalculator();

         @Test
        public void addTest(){
             double expected=6; //addition

            double  actual =test.basicOperations("+", 3,3);
             System.out.println("The actual value:"+actual);

             Assertions.assertEquals(expected,actual);
         }


         @Test
    public void sqrtTest(){
             double expected=9;
             double actual=test.basicOperations("SQ",3,0);
             System.out.println(actual);
             Assertions.assertEquals(expected,actual);

         }

         @Test
    public void inverseNumberTest(){
             String  expected= "1/5.0";
             String actual=test.getInverseOfNumber(5);
             System.out.println("Actual value:"+actual);
             Assertions.assertEquals(expected,actual);
         }
}