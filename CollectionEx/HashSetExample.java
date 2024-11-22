package CollectionEx;

import java.util.*;

public class HashSetExample {

   public static void main(String[] args) {
    HashSet<String> obj = new HashSet<>();
   
    
    List<String> obj2 = new ArrayList<>();
    obj2.add("Nikita");
    obj2.add("Priyanhi");
    obj2.add("Nikita");
    obj2.add("Ankita");
    obj2.add("Payal");
    obj2.add(5, "Muskan");

    obj.addAll(obj2);
    System.out.println(obj);
//2.
    @SuppressWarnings("rawtypes")
    Iterator itr = obj2.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }

//3.
System.out.println(obj.size());

 //4.
// obj.clear();

//5.
obj.isEmpty();

//6.
HashSet<String> newOb = new HashSet<>();
newOb.addAll(obj);

//7.

String[] arr = new String[obj.size()];
int ind = 0;
for(String s: obj){
arr[ind] = s;
System.out.println(arr[ind]);
ind++;
}

//Other approach
String[] arr2 = new String[obj.size()];
obj.toArray(arr2);

//8.

TreeSet<String> tob = new TreeSet<>(obj);
System.out.println(tob);

//9.
TreeSet<Integer> num = new TreeSet<>(Arrays.asList(1, 2, 4, 8, 9));

for(int n: num){GVY
    if(n < 7){
        System.out.println(n);
    }
}

//10.
obj.equals(tob);

//11.
TreeSet<Integer> num2 = new TreeSet<>(Arrays.asList(1, 3, 4, 7, 9));
for(int n: num){
    for(int m: num2){
        if(m == n){
            System.out.println(m);
        }
    }
}

//12.
obj.clear();

   }
}