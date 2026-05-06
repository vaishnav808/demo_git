import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
;

public class Demo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

         LocalTime time = LocalTime.now();
         System.out.println(time);
         System.out.println(time.getHour());
         System.out.println(time.getMinute());
         System.out.println(time.getSecond());

         LocalDateTime dateTime = LocalDateTime.now();
         System.out.println(dateTime);

         Instant instant = Instant.now();
         System.out.println(instant);

    
    }
}
