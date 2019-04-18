package collection;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr){
        int i,j,k;

        //Find index of beginning of last name
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if(k==0) //last names match,check entire name
            return aStr.compareToIgnoreCase(bStr);
        else
            return k;
    }
    //No need to override equals.
}
