package Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class FrequencyOfElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
//         HashSet<String> hashList =  new HashSet<>();
        
//         for(String s1: list){
//             int count = 0;
//             for(String s2: list){
//                 if(s1.equals(s2)){
//                     count++;
//                 }
//             }
//             hashList.add(s1 + " " + count);
//         }

// System.out.println(hashList);


// Other Approach

for(String s: list){
int count = Collections.frequency(list, s);
System.out.println(s + " " + count);
}
    }
}
