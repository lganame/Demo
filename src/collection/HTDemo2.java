package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String,Double> balance = new Hashtable<String,Double>();
        String str;
        double bal;
        balance.put("John Doe",3434.34);
        balance.put("Tom Smith",123.22);
        balance.put("Jane Baker",1378.00);
        balance.put("Tod Hall",99.22);
        balance.put("Ralph Smith",-19.08);

        //Show all balances in hashtable.
        //First,get a set view of the keys.
        Set<String> set = balance.keySet();
        //Get an iterator.
        Iterator<String> itr = set.iterator();
        while(((Iterator) itr).hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();
        //Deposit 1000 into JohnDoe's account.
        bal = balance.get("John Doe");
        balance.put("John Doe",balance.get("John Doe"));
    }


}
