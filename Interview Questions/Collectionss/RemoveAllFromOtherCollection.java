package Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
//How do you remove all elements from a List that are present in another List?

public class RemoveAllFromOtherCollection {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 5));
        ArrayList<Integer> obj1 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7));
        obj.removeAll(obj1);
        System.out.println(obj);

    }
}
