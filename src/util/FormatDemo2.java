package util;

import java.util.Calendar;
import java.util.Formatter;

public class FormatDemo2 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        //Display standard 12-hour time format.
        fmt.format("%tr",cal);
        System.out.println(fmt);
        fmt.close();

        //Display complete time and date information
        fmt = new Formatter();
        fmt.format("%tc",cal);
        System.out.println(fmt);
        fmt.close();

        //Display just hour and minute
        fmt = new Formatter();
        fmt.format("%t1:%tM",cal,cal);
        System.out.println(fmt);;
        fmt.close();

        //Display month by name and number.
        fmt = new Formatter();
        fmt.format("%tB %tb %tm",cal,cal,cal);
        System.out.println(fmt);
        fmt.close();
    }
}
