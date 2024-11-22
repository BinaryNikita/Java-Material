package Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*You are given a list of integers where every 
element appears twice except for one. 
Find that single element in O(n) time 
complexity and O(1) space complexity. */

public class FindUnique {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(4, 1, 2, 1, 2, 6));
        //finds all the unique element
        for (int a : al) {  
            if(Collections.frequency(al, a) == 1){
                System.out.println(a);
            }
        }

        // preferable approach for large data if there is only one unique value 
       int uniqueElement = 0;
        for (int a : al) {
            uniqueElement ^= a; // XOR each element
        }
        System.out.println(uniqueElement);
    

    // for(int i = 0; i < al.size(); i++){
    //      int count = 0;
    //      for(int j = 0 ; j < al.size(); j++){

    //          if(al.get(i).equals(al.get(j))){
    //             count++;
    //          }
    //      }
    //     if(count == 1){
    //         System.out.println(al.get(i));
    //     }
    //  }
}
}