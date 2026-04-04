package test;

public class Division implements operations {
    public double calculate(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Error: divide by zero not allowed");
            }
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
