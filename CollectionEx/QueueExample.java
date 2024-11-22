package CollectionEx;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> ob = new LinkedList<>();
        
        ob.add("Nikita");
        ob.add("Ankita");
        ob.add("Neha");
        ob.add("Archana");
        System.out.println(ob);
        ob.remove();
        System.out.println(ob);
        System.out.println(ob.peek());
        System.out.println(ob.poll());
        System.out.println(ob);
        // ob.clear();
        // System.out.println(ob);
        System.out.println(ob.element());
        Queue<Integer> ob2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        ob2.offer(1);
        System.out.println(ob2);
        Queue<Integer> ob22 = ob2;
        System.out.println(ob22);
        System.out.println(ob2 == ob22);

        
        





    }
}
