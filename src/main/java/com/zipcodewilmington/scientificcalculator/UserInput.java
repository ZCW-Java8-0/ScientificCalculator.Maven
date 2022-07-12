package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class UserInput {
    static double num1=0.0;
    static double num2=0.0;
    static String oper;
    static int option;
    /**
     * takes 3 values from user
     */
    Scanner sc = new Scanner(System.in);
        public void getUserInput(){
            String inp1 = "";
            String inp2 = "";
            String op = "";
            //Scanner sc = new Scanner(System.in);
            System.out.println("Chose you operator:");
            System.out.println("Enter + for Addition");
            System.out.println("Enter - for Sub");
            System.out.println("Enter * for Multi");
            System.out.println("Enter / for Div");
            System.out.println("Enter E for Exponential");
            System.out.println("Enter IS for Inverse Sign");
            System.out.println("Enter IN for Invert of a number");
            System.out.println("Enter SQR for Square Root of a number");
            System.out.println("Enter SQ for Square a number");

            op = sc.nextLine();
            oper=op;
            System.out.println("Enter number1:");
            inp1 = sc.nextLine();
             num1=Double.parseDouble(inp1);
            System.out.println("Entered:"+inp1);
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") ||op.equals("E")) {
                System.out.println("Enter num2:");
                inp2 = sc.nextLine();
                num2 = Double.parseDouble(inp2);
            }
        }


         public int continueOrExit(){
             System.out.println("Please enter 0 -> to continue calculator operations or Any other number to -> Exit");
           String str= sc.nextLine();
             return option=Integer.parseInt(str);

        }



}
