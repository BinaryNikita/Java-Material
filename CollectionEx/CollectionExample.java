package CollectionEx;
import java.util.*;


public class CollectionExample {
    public static void main(String[] args) {
        ArrayList <String> arrList = new ArrayList<>();
        System.out.println(arrList.size());
        arrList.add("Nikita");
        arrList.add("Tripti");
        arrList.add("payal");
        System.out.println(arrList.size());
        System.out.println(arrList);
        arrList.add(2, "Priyanshi");
        arrList.add(3, "Muskan");
        System.out.println(arrList);
        System.out.println(arrList.size());

    }
}
