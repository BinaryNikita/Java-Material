package CollectionEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>(Arrays.asList("Nikita", "Kashish", "Payal"));
        // System.out.println(l1);

         l1.addFirst("Aakansha");
        //  System.out.println(l1.getLast());
        //  System.out.println(l1.getFirst());
        //  System.out.println( l1.element());
        // for(int i = 0; i < l1.size(); i++){
        //     System.out.println(l1.get(i));
        // }

        // System.out.println(l1.size());
        // System.out.println(l1.contains("Nikita"));
        // System.out.println("Peek: " +  l1.peek());
        // l1.descendingIterator();
        // System.out.println( "descending" + l1);
        // Collections.unmodifiableCollection(l1);
        // l1.add("New");
        // System.out.println(l1);
        // Collections.unmodifiableList(l1);
        // System.out.println(l1);
        List<String> unmodifiableList = Collections.unmodifiableList(l1);
        l1.add("Unmod");
        // unmodifiableList.add("Nik");
        System.out.println(unmodifiableList);  
        System.out.println(l1); 





    }
}




