package tools;

public class AdvCalculator  {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}