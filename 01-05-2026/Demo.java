import java.util.HashSet;
import java.util.Set;

        this.a = a;
        this.b = b;
    }
    public int add() {
        return a + b;
    }

    public int add(int x, int y) {
        return x + y;
    }
}



public class Demo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5,3);
        int result = calculator.add();
        int result2 = calculator.add(10, 20);
        System.out.println("The sum is: " + result);
        System.out.println("The sum is: " + result2);
    }
}
