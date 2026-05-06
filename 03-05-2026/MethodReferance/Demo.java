

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // Using method reference to print each element in the list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List <String> uNames = names.stream().map(String::toUpperCase).toList();
        uNames.forEach(System.out::println);
    }
}