package Collectionss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//How do you convert a Map to a List of key-value pairs?
public class MapToList {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);
List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
System.out.println(list);
// for (Map.Entry<String, Integer> entry : list) {
//     System.out.println(entry.getKey() + ": " + entry.getValue());
// }



    }
}
