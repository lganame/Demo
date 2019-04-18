package collection;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        //Create an array list for doubles.
        ArrayList<Double> vals = new ArrayList<>();
        //Add values t o the array list
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //Use tryAdvance() to display contents of vals
        System.out.println("Contents of vals:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while(spltitr.tryAdvance((n)-> System.out.println(n)));
        System.out.println();
        //Create new list that contains square roots.
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        spltitr.forEachRemaining((n)-> System.out.println(n));
        System.out.println();

    }
}
