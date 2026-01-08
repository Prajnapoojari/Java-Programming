import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time_ex1 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.of(12, 45);
        System.out.println(t);
        ZoneId zId = ZoneId.of("Asia/Kolkata");
        System.out.println("Zone ID: " + zId);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zId);
        System.out.println("Zoned Date and Time: " + zonedDateTime);

    }
}
