package utilsTest;

import Utils.DateUtil;

public class DateUtilTest {
    /*Utils.DateUtil.getCurrentTime()
            getCurrentTime*/
    public static void main(String[] args) {
        System.out.println(DateUtil.getCurrentTime());
        System.out.println(DateUtil.getSeconds("2019-04-29 11:21:38","2019-04-29 11:23:38"));
        System.out.println(DateUtil.getTimebyDay(15));
        System.out.println(DateUtil.getDays("2019-4-29","2018-06-21"));
    }
}
