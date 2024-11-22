package Recurssion;
/*
 * ecursion in Java is a powerful programming technique that 
 * allows a function to call itself within the body of its own 
 * function. It gives an elegant and clear method for breaking 
 * down big issues into smaller, more manageable subproblems. 
 * Recursion in Java is frequently utilized in a variety of applications.
 */

public class RecurssiveFunction {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Tha factorial of 4 is: " + factorial(5));
    }
}

 class RecurssionFibonacci {
    public static void fibonacci(int range){
        for (int i = 0; i < range; i++) {
            System.out.println(fibonacciRecursive(i));
        }
    }

    private static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci series up to 10 terms:");
        fibonacci(10);
    }
}
