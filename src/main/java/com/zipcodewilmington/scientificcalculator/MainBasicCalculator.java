package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class MainBasicCalculator {
    public static void main ( String[] args ) {


        BasicCalculator basicTest = new BasicCalculator();
        Display display = new Display();
        UserInput uInput = new UserInput();
        System.out.println("Welcome to Basic Calculator, current state:"+display.getStateORShowDisplay());
          uInput.getUserInput();

          if(UserInput.oper.equalsIgnoreCase("IN")){
              System.out.println(basicTest.getInverseOfNumber(UserInput.num1));
          }
          else {
              System.out.println("Result:" + UserInput.num1 + UserInput.oper + UserInput.num2 + "=" + basicTest.basicOperations(UserInput.oper, UserInput.num1, UserInput.num2));
          }

    }
}
