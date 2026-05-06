import java.util.ArrayList;
import java.util.List;
public class Demo {
    
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(10, 40, 60, 20, 30));
       


        nums.parallelStream().forEachOrdered(System.out::println);
    }   
    


}
