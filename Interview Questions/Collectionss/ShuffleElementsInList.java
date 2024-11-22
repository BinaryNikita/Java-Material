package Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShuffleElementsInList {

    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>(Arrays.asList("Nikita", "Payal", "Bhavna"));
        Collections.shuffle(obj);
        System.out.println(obj);
    }
}