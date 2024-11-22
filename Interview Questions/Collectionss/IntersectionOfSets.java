package Collectionss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfSets {
    public static void main(String[] args) {
        Set<Integer> obj = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> obj2 = new HashSet<>(Arrays.asList(2,3,4));
        for(int a: obj){
            for(int b: obj2){
                if(a == b){
                    System.out.println(a);
                }
            }
        }

        obj.retainAll(obj2);


        for (int a : obj) {
            System.out.println(a);
        }
    }
}
