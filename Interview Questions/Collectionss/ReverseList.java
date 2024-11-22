package Collectionss;
//How can you reverse a List?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>(Arrays.asList("Nikita", "Payal", "Bhavna","Akanksha"));
        // Collections.sort(obj);
        Collections.reverse(obj);
        System.out.println(obj);

    }
}
