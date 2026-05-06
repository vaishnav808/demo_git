import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.assertions.assertEquals;




class Calculator{

    public int add(int a, int b) {
        return a + b;
    }

    public  int subtract(int a, int b) {
        return a - b;
    }


}


public class Demo {
    public static void main(String[] args) {
        
        @Test
        void testAdd() {
            Calculator calculator = new Calculator();
            int result = calculator.add(2, 3);
            assertEquals(5, result);
        }
    }

}