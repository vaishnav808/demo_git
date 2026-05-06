
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Demo {

    public static void main(String[] args) {
        List <String> names = new ArrayList<>(List.of("Priyanka", "Anjali", "Pooja", "Sonal"));

        Optional<String> name = names.stream().filter(str -> str.startsWith("X")).findFirst();
        System.out.println(name.orElse("Name not found"));
    }
    
}
