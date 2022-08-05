//https://school.programmers.co.kr/learn/courses/30/lessons/12901

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class init2 {
    public static void main(String[] args) {

    }

    public String getDayName(int month, int day) {
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month - 1, day).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }

    public String solution(int a, int b) {
        String answer = "";
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);

        answer = sdf.format(date).toUpperCase();
        return answer;
    }

}
