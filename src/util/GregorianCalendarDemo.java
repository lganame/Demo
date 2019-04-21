package util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String months[] = {
                "Jan","Feb","Mar","Apr",
                "May","Jun","Jul","Aug",
                "Sep","Oct","Nov","Dec"
        };
        int year;
        //Create a Gregorian calendar initialized
        //with the current date and time in the
        //default locale and timezone.
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        //Display current time and date information
        System.out.println("Date: ");
        System.out.println(months[gregorianCalendar.get(Calendar.MONTH)]);
        System.out.println(" "+gregorianCalendar.get(Calendar.DATE)+" ");
        System.out.println(year = gregorianCalendar.get(Calendar.YEAR));

        System.out.println("Time: ");
        System.out.println(gregorianCalendar.get(Calendar.HOUR)+" : ");
        System.out.println(gregorianCalendar.get(Calendar.MINUTE)+" : ");
        System.out.println(gregorianCalendar.get(Calendar.SECOND));

        //Test if the current year is a leap year
        if(gregorianCalendar.isLeapYear(year)){
            System.out.println("The current year is a leap year");
        }else{
            System.out.println("The current year is not a leap year");
        }
    }
}
