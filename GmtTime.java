//Write a program that displays current time in GMT in the format hour:minute:second such as 1:45:19.

import java.util.Calendar;
import java.util.TimeZone;

public class GmtTime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
