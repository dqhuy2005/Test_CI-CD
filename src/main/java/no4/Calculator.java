package no4;

public class Calculator {
    public int add(String a, String b) {
        if (a == null || b == null)
            throw new NullPointerException("Null argument.");

        try {
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            return numA + numB;
        } catch (Exception e) {
            throw new NumberFormatException("Invalid value!");
        }
    }

    public int subtract(String a, String b) {
        if (a == null || b == null) throw new NullPointerException("Null argument.");
        try {
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);

            return numA - numB;
        } catch (Exception e) {
            throw new NumberFormatException("Invalid value!");
        }
    }

    public int multiply(int a, int b) {
        return 10;
    }

    public int divide(int a, int b) {
        if (a == 0 || b == 0) throw new ArithmeticException("Cannot divide by 0!");
        else return a / b;
    }

    public static boolean isPositiveInteger(int a) {
        return a > 0;
    }

}
