package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;

public class BasicCalculator {
    double num1 = 0.0;
    double num2 = 0.0;
    static String op;
    static double result = 0.0; //current  state displayed on calculator, call this variable before every test
    static Scanner scan;

//This I was trying to input operation from user, but in TestClass I had difficulty in implementing
/* public int getUserNeed() {
        scan= new Scanner(System.in);
        System.out.println("Please enter the operations: 1:Addition,2:Sub,3:Mul,4:Div");
        int op=scan.nextInt();
        System.out.println("Please enter the operat:"+op);
        return op;
}
*/

    /**
     * @param op   : used for operations like +,-,*,/, E->Exponential, IS ->Inverse Sign
     *               SQR -> SquareRoot, SQ -->Square
     * @param num1 : input number1
     * @param num2 : input number 2
     * @return : Returns the result of all 4 operations depending on the 'op' is passed
     */
    public double basicOperations ( String op, double num1, double num2 ) {

        if (op.equals( "+")) {

            result = num1 + num2;
        } else if (op.equals( "-")) {
            result = num1 - num2;
        } else if (op.equals( "*")) {
            double mul = num1 * num2;
            result = Double.parseDouble(String.format("%.2f", mul));
        } else if (op.equals( "/")){
             if(num2!=0) {
                 double div = num1 / num2;
                 result = Double.parseDouble(String.format("%.2f", div));
             }
               else{
                   String str="Infinity";
                   result = Double.parseDouble(str);
                 System.out.println("Divide by zero error encountered");
             }

        }
        else if(op.equalsIgnoreCase("E")){
            result=Math.pow(num1,num2);


        }
        else if(op.equalsIgnoreCase("IS")){
            result=num1*-1;
        }

        else if(op.equalsIgnoreCase("SQR")){
            result=Math.sqrt(num1);


        }
        else if(op.equalsIgnoreCase("SQ")){
            result=num1*num1;


        }
        else {
            System.out.println("please enter proper operation");
        }
        return result;
    }

    /**
     * @param number--> Accepts double  input   parameter
     * @return -> return the inverse of  number  parameter 1/number
     */
    public String getInverseOfNumber ( double  number) {
        String  res = "";
        if (number==0|| number ==1) {
            res = String.valueOf(number);

        } else {
            res="1/"+String.valueOf(number);

        }
        return res;
    }




}
