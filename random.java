import java.util.Random;

public class random {
    public static void main(String[] args) {
        int number  = 5;
        Random random = new Random();

        random.ints(1, 100).limit(number).forEach(System.out::println);
    }
}
