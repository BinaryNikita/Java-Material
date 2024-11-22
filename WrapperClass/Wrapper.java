package WrapperClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class Wrapper {
    public static void main(String[] args) {
        Integer age = 30;
        int newAge = age;
        // System.out.println(age);
        // System.out.println(newAge);
        // System.out.println(age == newAge);

        // int value = null; //not possible
        // Integer value = null; // possible
        // System.out.println(value);
		// Integer I = Integer.valueOf("10"); 
		// System.out.println(I); 
		// Double D = Double.valueOf("10.0"); 
		// System.out.println(D); 
		// Boolean B = Boolean.valueOf("true"); 
		// System.out.println(B); 

        // int a = I;
        // System.out.println(a);
        
		// Here we will get RuntimeException 
        // System.out.println(I);
        // System.out.println(D);
        // System.out.println(B);
        // System.out.println(I1);
		// Integer I1 = Integer.valueOf("ten"); 

    Collection <Integer> obj = new ArrayList<>();
    obj.add(23);
    obj.add(12);
    obj.add(12);
    obj.add(12);
    obj.add(12);
    obj.remove(12);
    System.out.println(obj);

    List <Integer> ob = new ArrayList<>();
    ob.add(age);
    ob.add(age-21);
    System.out.println(ob);
    
    Set <Integer> s = new HashSet<>();
     
	} 
}


