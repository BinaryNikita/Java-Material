package Exception;
import java.util.Scanner;
class Divider {

    public static double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        if (denominator < 0){
            throw new ArithmeticException("Dont give negative value");
        }
        double result = (double) numerator / denominator;
        System.out.println(result);
        return result;
    }

}

public class ThrowException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int num = sc.nextInt();
        System.out.print("Enter the denominator: ");
        int den = sc.nextInt();

        try {
            Divider.divide(num, den);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    
        sc.close();
    }
}
