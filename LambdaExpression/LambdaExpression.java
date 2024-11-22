package LambdaExpression;

@FunctionalInterface
 interface FunctionalInterfaceExample {
// void sum(int a, int b); // with no return type
int sum(int a, int b); // with return type
    
}

public class LambdaExpression{
    public static void main(String[] args) {
    //    FunctionalInterfaceExample obj = (a, b) -> System.out.println("The sum is: " + (a + b));
    //     obj.sum(23, 45);
FunctionalInterfaceExample obj = (a, b) -> (a + b);
System.out.println("The sum is: " + obj.sum(90, 23));
// System.out.println((str) -> (str.length()));
    }
}

