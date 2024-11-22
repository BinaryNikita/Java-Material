package CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;

public class DeepandShallowCopy {
    public static void main(String[] args) {

ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));


ArrayList<Integer> shallowCopy = new ArrayList<>(originalList);

ArrayList<Integer> shallowCopy2 = (ArrayList) originalList.clone();


shallowCopy2.add(null);
// System.out.println(shallowCopy);
System.out.println(shallowCopy2);
System.out.println(originalList);




    }
}
