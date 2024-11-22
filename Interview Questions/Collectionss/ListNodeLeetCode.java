import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ListNodeLeetCode {

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer>  l2) {
        Iterator<Integer> it1 = l1.descendingIterator();
        Iterator<Integer> it2 = l2.descendingIterator();

        String sum1 = "";
        String sum2 = "";
        for (int l : l1) {
            sum1 += l;
        }
        for (int l : l2) {
            sum2 += l;
        }

        int total = Integer.parseInt(sum1) + Integer.parseInt(sum2);

        String strTotal = Integer.toString(total);
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < strTotal.length(); i++) {
            result.add(Character.getNumericValue(strTotal.charAt(i)));
        }

        return result;
    }

    
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(9, 9, 9));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(1));

       System.out.println(addTwoNumbers(l1, l2)); 


    }
}