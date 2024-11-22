package CollectionEx;
import java.util.*;

public class HasmapExample {
    public static void main(String[] args) {
        HashMap<Integer, Integer> ob =  new HashMap<>();
        ob.put(12, 1);
        ob.put(13, 2);
        ob.put(14, 3);
        
        // System.out.println( ob.keySet());
        // System.out.println(ob.replace(12, 7));
        // System.out.println(ob);


        HashMap<String, String> str = new HashMap<>();
        str.put("13", "Nikita");
        str.put("11", "Ankita");
        str.put("12", "Shreya");
        str.put("10", "priyanshi");
        System.out.println(str.get("10"));
        System.out.println(str.containsKey("11"));
        System.out.println(str.containsValue("Nikita"));
        System.out.println(str.values());
        str.putIfAbsent("15", "Aakansha");
        str.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("For loop");
        for(Map.Entry<String, String> entry: str.entrySet()){
            String k  = entry.getKey();
            String v = entry.getValue();
            System.out.println("Key: " + k + "Value: " + v);
        }

        
        


    }
}
