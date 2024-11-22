package CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListExample {

    public static void main(String[] args) {
        ArrayList <String> obj = new ArrayList<>();
        obj.add("C");
        obj.add("C++");
        obj.add("C#");
        obj.add("Python");
        obj.add("Java");
        obj.add("C");
       
// System.out.println(obj.get(3));
// System.out.println(obj.indexOf("C"));
// System.out.println(obj.lastIndexOf("C"));
         
ArrayList <String> obj2 = new ArrayList<>();
obj2.addAll(obj);

obj2.set(2, "GoLang");

// System.out.println(obj2);
// System.out.println(obj2.remove("C"));
// System.out.println(obj2);
// System.out.println(obj.subList(2, 5));
// System.out.println(obj.listIterator());
// System.out.println(obj.listIterator(4));
// System.out.println(obj2.contains("Ruby"));

// obj.clear();
// obj.removeAll(obj2);
// System.out.println(obj);
// System.out.println(obj.isEmpty());

// for(String o: obj){
//     System.out.println(o);
// }
// System.out.println();
// for(int i = 0; i < obj.size(); i++){
//     System.out.println(obj.get(i));
// }
//     }

    // obj.forEach(a -> {
    //     System.out.println(a);
    // });
    // ArrayList<Integer> alArrayList = new ArrayList<>();
    // alArrayList.addAll( Arrays.asList( 1,2,3,4,5 ) );
    // System.out.println(alArrayList);

    ArrayList<Integer> alArrayList2 = new ArrayList<>(Arrays.asList(8,9,2,3,5,6));
    // alArrayList2.remove(2);

    ArrayList i = (ArrayList)alArrayList2.clone();
    System.out.println(i);
    // alArrayList2.set(0, 0);
    // boolean contains = i.contains("Element");
    // System.out.println(contains);
    // alArrayList2.sort(null);
    // System.out.println(alArrayList2);
    ArrayList<String> list = new ArrayList<>();

    List<String> anotherList = Arrays.asList("One", "Two");
list.addAll(anotherList);
System.out.println(list);
 

}
}


 class RemoveIfExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) { 
                iterator.remove(); 
            }
        }

        System.out.println(numbers);


           
    }
}


class Parent1{

}

class Child1 extends Parent1{

}

class DefaultDriver{
    Parent1 p1 = new Parent1();
    Child1 c1 = (Child1) p1;
}



class ArrayListToarray{
    public static void main(String[] args) {
        ArrayList<Integer> ob  = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int[] arr = new int[ob.size()];

        for(int i = 0; i < ob.size(); i++){
            arr[i] = ob.get(i);
            System.out.println(arr[i]);
        }

        //Array to arraylist

        String[] array1 = {"apple", "banana", "cherry"};
  ArrayList<String> arrayList = new ArrayList<>( Arrays.asList(array1));
  System.out.println(arrayList);

  int[] arr4 = {1, 4, 5, 6};
ArrayList<Integer> a = new ArrayList<>();
for(int i = 0; i < arr4.length; i++){
    a.set(i, arr4[i]);
}

    }
}

