import java.time.LocalDate;
public class getDay {
     public static void main(String[] args) {

        int year = 1996;
        int month = 5;
        int day = 28;
        System.out.println(  LocalDate.of(year, month, day).getDayOfWeek().toString());
    }
}
