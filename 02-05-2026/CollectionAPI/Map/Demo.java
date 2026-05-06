
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map <String,Integer> studentsMap = new HashMap<>();
        studentsMap.put("Priyanka", 90);
        studentsMap.put("Satyarth", 80);
        studentsMap.put("jyoti", 85);
        studentsMap.put("mamata", 95);

        for (Map.Entry<String,Integer> entry: studentsMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
