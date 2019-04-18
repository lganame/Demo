package collection;

import java.util.Comparator;

public class MyComp implements Comparator<String>{
    public int compare(String aStr,String bStr){
        //Reverse the comparison.
        return bStr.compareTo(aStr);
    }
    //Mo need to override equals or the default methods
}

