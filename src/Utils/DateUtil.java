package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {

    /**
     * 英文简写（默认）如：2010-12-01
     */
    public static String FORMAT_SHORT = "yyyy-MM-dd";

    /**
     * 英文全称  如：2010-12-01 23:15:06
     */
    public static String FORMAT_LONG = "yyyy-MM-dd HH:mm:ss";

    /**
     * 精确到毫秒的完整时间    如：yyyy-MM-dd HH:mm:ss.S
     */
    public static String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss.S";

    /**
     * 中文简写  如：2010年12月01日
     */
    public static String FORMAT_SHORT_CN = "yyyy年MM月dd";

    /**
     * 中文全称  如：2010年12月01日  23时15分06秒
     */
    public static String FORMAT_LONG_CN = "yyyy年MM月dd日  HH时mm分ss秒";

    /**
     * 精确到毫秒的完整中文时间
     */
    public static String FORMAT_FULL_CN = "yyyy年MM月dd日  HH时mm分ss秒SSS毫秒";

    /**
     * 获取当前日期
     * @return time
     */
    public static  String  getCurrentTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(d);
    }
    /****
     * 获得2个日期之间的秒数差
     * @param startdate
     * @param enddate
     * @return
     */
    public static Integer getSeconds(String startdate, String enddate) {
        List<String> list = new ArrayList();
        SimpleDateFormat sf = new SimpleDateFormat(FORMAT_LONG);
        long interval = 0;
        try {
            Date d = sf.parse(startdate);
            Date d1 = sf.parse(enddate);
            interval = (d.getTime() - d1.getTime()) / 1000;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (int) interval;
    }
    /**
     * 获取当前日期
     * @return time
     */
    public static  String  getTimebyDay(int i){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, i);
        date = calendar.getTime();
        return sdf.format(date);
    }

    public static List<String> getDays(String startdate, String enddate){
        List<String> list = new ArrayList();
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        try {
            Date d = sf.parse(startdate);
            Date d1 = sf.parse(enddate);
            Date temp = null;
            long l = d1.getTime()-d.getTime();//获取2个date之间的时间差
            long ms = 1000;//防止在大位数的int运算时发生溢出
            int days = (int) (l/(24*60*60*ms));//算出2个date之间的天数
            for(int i=0;i<=days;i++){
                temp = new Date(d.getTime()+(i*24*60*60*ms));
                list.add(sf.format(temp));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return list;
    }

}
