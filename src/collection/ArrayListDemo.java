package collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Create an array list
        ArrayList<String> a1 = new ArrayList<String>();
        System.out.println("Initial size of a1: "+a1.size());
        //Add element to the array list
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1,"A2");
        System.out.println("Size of a1 after additions: "+a1.size());
        //Display the array list
        System.out.println("Contents of a1: "+a1);

        //Remove elements from the arrayList
        a1.remove("E");
        a1.remove(2);
        System.out.println("Size of a1 after deletions: "+a1.size());
        System.out.println("Contents of a1: "+a1);

    }
}
