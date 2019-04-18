package collection;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList<Address>();
        //Add elements to the linked list
        m1.add(new Address("J.W.West","ll Oak Ave","Urban","1L","61801"));
        m1.add(new Address("Ralph Baker","1142 Maple Lane","Mahomet","1L","61853"));
        m1.add(new Address("Tom Cariton","867 Elm st","Champaign","1L","61820"));
        //Dislay the mailling list.
        for(Address element:m1)
            System.out.println(element+"\n");
        System.out.println();
    }
}
