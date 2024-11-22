package Collectionss;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoSets {
    public static void main(String[] args) {
        HashSet<String> obj1 = new HashSet<>(Arrays.asList("Nikita", "Payal"));
        HashSet<String> obj2 = new HashSet<>(Arrays.asList("Nikita", "Bhavna"));
        obj1.addAll(obj2);
        System.out.println(obj1);
    }
}
