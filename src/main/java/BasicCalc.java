import static java.lang.Math.*;


public class BasicCalc {
    public static double result;
    public static double num1;
    public static double num2;

    //Addition method
    public static double add(double num1, double num2) {
        result = num1 + num2;
        System.out.println(result);
        return result;
    }

    //Subtraction method
    public static double subtract(double num1, double num2) {
        result = num1 - num2;
        System.out.println(result);
        return result;
    }

    //Multiplication method
    public static double multiply(double num1, double num2) {
        result = num1 * num2;
        System.out.println(result);
        return result;
    }

    //Division method. Need to figure out how to pass test when dividing by 0, need to show error.
    public static double divide(double num1, double num2) {
        result = num1 / num2;
        if (num2 == 00) {
            System.out.println("ERROR: You cannot divide a number by 0!");
        } else {
            return result;
        }
        return result;
    }

    //Square method
    public static double square(double num1) {
        result = num1 * num1;
        System.out.println(result);
        return result;
    }

    //Square root method
    public static double squareRoot(double num1) {
        result = Math.sqrt(num1);
        System.out.println(result);
        return result;
    }

    //Power Method
    public static double power(double num1, double num2) {
        result = Math.pow(num1, num2);
        System.out.println(result);
        return result;
    }

    //Inverse Method
    public static double inverse(double num1) {
        result = 1 / num1;
        if (num1 == 0) {
            System.out.println("ERROR: You cannot inverse a number by 0!");
        } else {
            return result;
        }
        return result;
    }

}

