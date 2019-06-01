package Sdformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Date {
    public static void main(String[] args) {
        System.out.println(new Date().toString());
        String time3 = "2019/05/22 14:33:43.012";
        String time = "2019-05-22 14:33:43.012";
        System.out.println(time.lastIndexOf("."));

        String time2 = time.substring(0,time.lastIndexOf("."));
        System.out.println(time2);
        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        try {
            java.util.Date date = sdf.parse(time);
            //java.util.Date date = sdf.parse(time);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }




        /*String str = "";
        if (time != null) {
            str = sdf.format(time);
        }
        System.out.println(str);*/
    }
}
