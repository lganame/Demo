package collection;

import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {
        //Pass a reverse comparator to TreeSet() via a lambda expression
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr)->bStr.compareTo(aStr));
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        //Display the elements
        for(String element:ts){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
