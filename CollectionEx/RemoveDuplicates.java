package CollectionEx;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};   
        Set<Integer> obj = new HashSet<>();   
        for (int i : arr) {
            obj.add(i);
        } 
        System.out.println(obj);
    }
}
