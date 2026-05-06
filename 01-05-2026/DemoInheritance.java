class Calculator{

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}


class AdvancedCalculator extends Calculator {
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






public class DemoInheritance {
    public static void main(String[] args) {
        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println(advCalc.add(5, 3));
        System.out.println(advCalc.subtract(5, 3));
        System.out.println(advCalc.multiply(5, 3));
        System.out.println(advCalc.divide(5, 3));
    }
}
