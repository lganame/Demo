package Sdformat;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Date2 {
    public static void main(String[] args) {
        Date   date =new   Date();
        System.out.println(date);
        String   p="yyyy-mm-dd HH:mm:ss";
        SimpleDateFormat kvsdf=new   SimpleDateFormat(p, Locale.ENGLISH);
        String   newdate=kvsdf.format(date);

        System.out.println("newdate>>>>>>>>>>>>>>>>"+newdate);
        String DateTime= "to_date('"+newdate+"','YYYY-MM-DD HH24:MI:SS')";
        System.out.println(DateTime);
    }

}

