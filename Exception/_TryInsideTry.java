package Exception;
import java.util.Scanner;
class _TryInsideTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the");
        try {
            int[] numbers = {1, 2, 3};
            try {
                int result = numbers[1] / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");
            }
            System.out.println(numbers[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds.");
        }
    }
}
