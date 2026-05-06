
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        
        System.err.println("Enter a number: ");

        // InputStreamReader reader = new InputStreamReader(System.in);
        // BufferedReader buffer = new BufferedReader(reader);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();



        // int num =  Integer.parseInt(buffer.readLine());
        System.out.println("You entered: " + num);

        scanner.close();
    }
}
