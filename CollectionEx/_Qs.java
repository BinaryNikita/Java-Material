package CollectionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class _Qs {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
hashMap.put("One", 1);
hashMap.put(null, 2); // Allowed

// Hashtable<String, Integer> hashtable = new Hashtable<>();
// hashtable.put("One", 1);
// hashtable.put(null, 2); // Throws NullPointerException

// System.out.println(hashMap);
// System.out.println(hashtable);

List<String> arrayList = new ArrayList<>();
arrayList.add("A");
arrayList.add("B");
arrayList.add("C"); // Fast for adding, O(1) time
System.out.println(arrayList.get(1)); // Fast for accessing, O(1) time

List<String> linkedList = new LinkedList<>();
linkedList.add("A");
linkedList.add("B");
linkedList.add("C"); // Efficient for inserting/deleting, O(1) time
System.out.println(linkedList.get(1)); // Slower for accessing, O(n) time


    }
}
