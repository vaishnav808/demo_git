

public class Demo {

    public static void main(String[] args) {
    Power advanceCalculator = new Power();
    int sum = advanceCalculator.add(5, 3);
    int difference = advanceCalculator.subtract(5, 3);
    int product = advanceCalculator.multiply(5, 3);
    int quotient = advanceCalculator.divide(5, 3);
    int power = advanceCalculator.power(5, 3);

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
    System.out.println("Power: " + power);
    }
}
