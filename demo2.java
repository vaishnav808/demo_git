
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;




public  class  demo2 {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
       List<Integer> numbersList =List.of(10, 20, 30, 40, 50);
       numbers.add(10);
       numbers.add(20);
       numbers.add(30);
       numbers.add(40);
       numbers.add(50);
    
        int secondLargest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst() 
                .orElse(null);

        System.out.println("The second largest number is: " + secondLargest);
    }
}