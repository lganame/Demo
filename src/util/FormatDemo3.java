package util;

import java.util.Formatter;

public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("Copying file%n Transfer is %d%% complete",88);
        System.out.println(fmt);
        fmt.close();
    }
}
