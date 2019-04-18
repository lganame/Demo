package collection;
//Use then Compariing() to
import java.util.Comparator;

public class CompLastNames implements Comparator<String> {
    public int compare(String aStr,String bStr){
        int i,j;
        //Find index of beginning of last name
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }

}
