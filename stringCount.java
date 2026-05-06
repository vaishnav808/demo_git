import java.util.ArrayList;

public class stringCount {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Welcome");
        strings.add("to"); 
        strings.add("Java");
        strings.add("programming");
        long count = 0L ;
        count = strings.stream()
        .filter(s -> s.length() > 5)
        .count();
        System.out.println("Number of strings with length greater than 5: " + count);

    }       
}
