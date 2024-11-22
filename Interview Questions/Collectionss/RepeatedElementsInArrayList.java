package Collectionss;

import java.util.*;
// Input: [1, 2, 3, 4, 2, 5, 3]
// Output: 2

// Input: [10, 20, 30, 40, 50]
// Output: -1

// Input: [5, 6, 7, 8, 6, 9, 5]
// Output: 6
//Given an ArrayList of integers, write a Java program to find the first element that is repeated. If there is no repeated element, return -1.

public class RepeatedElementsInArrayList {

    public static int firstRepeated(ArrayList<Integer> al) {
        if (al == null || al.size() == 0) {
            System.out.println("List is empty");
            return -1;
        }

        int first = 0;
        for (int a : al) {
            if (Collections.frequency(al, a) > 1) {
                first = a;
                break;
            }
        }

        if (first == 0) {
            return -1;
        } 
        return first;
        

    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5, 3));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 6, 9, 5));

        System.out.println(firstRepeated(al));
        System.out.println(firstRepeated(al1));
        System.out.println(firstRepeated(al2));
        System.out.println(firstRepeated(al3));


    }
}
