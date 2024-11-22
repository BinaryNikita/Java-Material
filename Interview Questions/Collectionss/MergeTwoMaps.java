package Collectionss;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        //8. How can you merge two Maps?

        Map<Integer, String> obj = new HashMap<>();
        obj.put(1, "Nikita");
        obj.put(2, "Payal");
        Map<Integer, String> obj2 = new HashMap<>();
        obj2.put(2, "Rohan"); 
        obj2.put(3, "Sonia");
        obj2.putAll(obj);
        System.out.println(obj2);

    }
}
