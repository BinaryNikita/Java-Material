package CollectionEx;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeCreation {
    public static void main(String args[]) {
        
        // Create a Deque of Strings
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Bhavna");
        deque.add("Priyanshi");
        // here, we can write all the operations in deque
        
        // Displaying the Deque
        System.out.println("Deque elements: " + deque);
    }
}
