package com.zipcodewilmington.scientificcalculator;

public class Reader {
    public static void reader() {
        double second;
        switch (MainApplication.operation) {
            case "+":
                second = Console.getDoubleInput("Enter second number:");
                MainApplication.current = operation.addition(MainApplication.current, second);
                break;
            case "-":
                second = Console.getDoubleInput("Enter second number:");
                MainApplication.current = operation.subtraction(MainApplication.current, second);
                break;
            case "*":
                second = Console.getDoubleInput("Enter second number:");
                MainApplication.current = operation.multiplication(MainApplication.current, second);
                break;
            case "/":
                second = Console.getDoubleInput("Enter second number:");
                if (second == 0) {
                    Console.println("Err");
                    MainApplication.onOff = false;
                } else
                    MainApplication.current = operation.divison(MainApplication.current, second);
                break;
            case "sq":
                MainApplication.current = operation.square(MainApplication.current);
                break;
            case "sqrt":
                MainApplication.current = operation.squareRoot(MainApplication.current);
                break;
            case "exp":
                second = Console.getDoubleInput("Enter second number:");
                MainApplication.current = operation.exponents(MainApplication.current, second);
                break;
            case "1/N":
                MainApplication.current = operation.inverseNumber(MainApplication.current);
                break;
            case "-N":
                MainApplication.current = operation.inverseSign(MainApplication.current);
                break;
            //scientific methods
            case "MC":
                MainApplication.mStorage = 0;
                break;
            case "MS":
                MainApplication.mStorage = MainApplication.current;
                break;
            case "M+":
                MainApplication.current = Scientific.mAdd(MainApplication.mStorage, MainApplication.current);
                break;
            case "M-":
                MainApplication.mStorage = Scientific.mSubtract(MainApplication.mStorage, MainApplication.current);
                break;
            case "MR":
                MainApplication.current = MainApplication.mStorage;
                break;
            case "sin":
                MainApplication.current = Scientific.getSin(MainApplication.isRadian, MainApplication.current);
                break;
            case "cos":
                MainApplication.current = Scientific.getCos(MainApplication.isRadian, MainApplication.current);
                break;
            case "tan":
                MainApplication.current = Scientific.getTan(MainApplication.isRadian, MainApplication.current);
                break;
            case "asin":
                MainApplication.current = Scientific.getaSin(MainApplication.isRadian, MainApplication.current);
                break;
            case "acos":
                MainApplication.current = Scientific.getaCos(MainApplication.isRadian, MainApplication.current);
                break;
            case "atan":
                MainApplication.current = Scientific.getaTan(MainApplication.isRadian, MainApplication.current);
                break;
            case "log":
                MainApplication.current = Scientific.getLog(MainApplication.current);
                break;
            case "ln":
                MainApplication.current = Scientific.getNaturalLog(MainApplication.current);
                break;
            case "log-1":
                MainApplication.current = Scientific.getInverseLog(MainApplication.current);
                break;
            case "ln-1":
                MainApplication.current = Scientific.getInverseNaturalLog(MainApplication.current);
                break;
            case "!":
                MainApplication.current = Scientific.getFactorial((int) MainApplication.current);
                break;
            case "Absolute Value":
                MainApplication.current = Scientific.getAbs(MainApplication.current);
                break;
            case "Cube":
                MainApplication.current = Scientific.cube(MainApplication.current);
                break;
            case "Current":
                break;
            case "Change":
                MainApplication.current = Console.getDoubleInput("Enter new Number:");
                break;
            case "Clear":
                MainApplication.current = 0;
                MainApplication.current = Console.getDoubleInput("Enter new Number:");
                break;
            case "Off":
                MainApplication.onOff = false;
                break;
            case "switchUnitsMode":
                MainApplication.isRadian = Scientific.changeTrigCycle(MainApplication.isRadian);
                break;
            case "Radians":
            case "Degrees":
                MainApplication.isRadian = Scientific.changeTrig(MainApplication.isRadian, MainApplication.operation);
                break;
            case "DisplayUnitsMode":
                if (MainApplication.isRadian)
                    Console.println("The calculator is set to Radians");
                else
                    Console.println("The calculator is set to Degrees");
                break;
            case "switchDisplayMode":
                Scientific.switchDisplayMode();
                break;
            case "Binary":
            case "Octal":
            case "Decimal":
            case "Hexadecimal":
                MainApplication.displayType = MainApplication.operation;
                break;
            case "Current Display type":
                Console.println("Currently displaying in "+MainApplication.displayType);
            default:
                Console.println("Please pick a valid command");
                break;
        }
    }

    public static String display() {
        String number="";
        switch (MainApplication.displayType) {
            case "Binary":
                break;
            case "Octal":
                break;
            case "Decimal":
                number=Double.toString(MainApplication.current);
                break;
            case "Hexadecimal":
                number=Double.toHexString(MainApplication.current);
                break;
        }
        return number;
    }
}

