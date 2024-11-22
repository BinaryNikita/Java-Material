package Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>(Arrays.asList("Nikita", "Payal", "Bhavna", "Nikita","Kashish"));
    //     for(int i = 0; i < obj.size(); i++){
    //         for(int j = i + 1; j < obj.size(); j++){
    //             if(obj.get(i).equals(obj.get(j)) ){
    //                 obj.remove(i);
    //             }
    //         }
    //     }

    //    System.out.println(obj);

    HashSet<String> obj2 = new HashSet<>(obj);
    obj.clear();
    obj.addAll(obj2);
    System.out.println(obj);

    }
}
