package util;

import java.util.Formatter;

public class FormatDemo_2 {
    public static void main(String[] args) {
        try(Formatter fmt = new Formatter())
        {
            fmt.format("Formatting %s is easy %d %f","with Java",10,98.6);
            System.out.println(fmt);
            fmt.format("%,.2f",4356783497.34);
            System.out.println(fmt);
            fmt.format("%X",250);
            System.out.println(fmt);
            fmt.format("%E",123.1234);
            System.out.println(fmt);
            fmt.format("3$d %1$d %2$d",10,20,30);
            System.out.println(fmt);
            fmt.format("%d in hex is %1$x",255);
            System.out.println(fmt);

        }
    }
}
