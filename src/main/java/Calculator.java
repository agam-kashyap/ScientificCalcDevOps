public class Calculator {
    public static double sum(double value1, double value2) {
        return value1 + value2;
    }

    public static double subtract(double value1, double value2) {
        return value1 - value2;
    }

    public static double divide(double value1, double value2) {
        if(value2 == 0) {
            displayError();
        }
        return value1 / value2;
    }

    public static double multiply(double value1, double value2) {
        return value1 * value2;
    }

    public static double square(double value1) {
        return value1 * value1;
    }

    public static double squareRoot(double value1) {
        return Math.sqrt(value1);
    }

    public static double Exponent(double value1, double value2) {
        return Math.pow(value1, value2);
    }

    public static double naturalLogarithm(double value1) {
        return Math.log(value1);
    }

    public static double factorial(double value1) {
        if(value1 == 1) {
            return 1;
        }
        return value1 * (factorial(value1-1));
    }

    private static void displayError() {
        System.out.println("ERROR - Division by 0");
    }
}
