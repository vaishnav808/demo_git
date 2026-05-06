
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Demo{

 public static void main(String[] args) {
     Set<Integer> nums  =  new HashSet<Integer>();
     nums.add(10);
     nums.add(40);
     nums.add(60);
     nums.add(20);
     nums.add(30);

     Iterator<Integer> values = nums.iterator();

     while(values.hasNext()){
        System.out.println(values.next());
     }
 }
  
  

}