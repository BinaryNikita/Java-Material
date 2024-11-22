package Collectionss;

import java.util.HashMap;
import java.util.Map;

public class AutoIncreamentKey {

    public static void main(String[] args) {
       HashMap<Integer, String> obj = new HashMap<>();
       int autoIncreamentKey = 1;
       obj.put(autoIncreamentKey++, "Nikita");
       obj.put(autoIncreamentKey++, "Payal");
       obj.put(autoIncreamentKey++, "Bhavna");
       obj.put(autoIncreamentKey++, "Mahima");
       System.out.println(obj.keySet());

       for (Map.Entry<Integer, String> entry : obj.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}