package CollectionEx;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CopyListExample {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>();
        l1.add("One");
        l1.add("Two");
        l1.add("Three");
        l1.add("Four");

        List<String> l2 = new LinkedList<>(Collections.nCopies(l1.size(), ""));

        Collections.copy(l2, l1);
        System.out.println("Elements in l2: " + l2);
    }
}

