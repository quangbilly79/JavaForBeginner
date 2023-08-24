package javacourse.section15stringwrapperclassdate;
import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.*;
import java.util.Date;


public class TestDate {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date); // Thu Aug 24 17:01:42 ICT 2023

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateformat = dateFormatter.format(date);
        System.out.println(dateformat); // 2023-08-24

        LocalDate now = LocalDate.now();
        System.out.println(now); // 2023-08-24
    }
}
