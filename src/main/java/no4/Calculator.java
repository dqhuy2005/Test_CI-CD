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
        return a + b;
    }

    public int divide(int a, int b) {
        if (a == 0 || b == 0) throw new ArithmeticException("Cannot divide by 0!");
        else return a / b;
    }

    public static boolean isPositiveInteger(int a) {
        return a > 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Divide 0
        try {
            System.out.println("10 / 0 = " + calculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Have !@#!@#!@#!@#!@3
        try {
            System.out.println("calculator.add(\"10\", \"abc\") = " + calculator.add("10", "!!@#"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        // Null argument
        try {
            System.out.println("add(null, 5) = " + calculator.add(null, "5"));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

}
