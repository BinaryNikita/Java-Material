package Collectionss;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SortNullKeyInMap {
    public static void main(String[] args) {
        HashMap<Character, Integer> obj = new HashMap<>();
        char key = 'S';
        int value = 101;
        obj.put(null, value++);
        obj.put(key--, value++);
        obj.put(key--, value++);
        obj.put(key--, value++);
        obj.put('M', 1);
        
        // //preferred approach
        // Comparator<Character> comparator = (c1, c2) -> {
        //     if (c1 == null) return -1; // Consider null as less than any other key
        //     if (c2 == null) return 1;
        //     return Character.compare(c1, c2);
        // };

        // TreeMap<Character, Integer> obj2 = new TreeMap<>(comparator);
        // obj2.putAll(obj);
        // System.out.println(obj2);

        Stream<Map.Entry<Character, Integer>> sorted =
    obj.entrySet().stream().sorted(Map.Entry.comparingByValue());
    sorted.forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        //another approach
        // System.out.println(obj);
        // if (obj.containsKey(null)) {
        //     obj.remove(null);
        // }

    //   TreeMap<Character, Integer> obj2 = new TreeMap<>(obj);
    //   System.out.println(obj2);


    }
}
