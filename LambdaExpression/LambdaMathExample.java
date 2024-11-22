package LambdaExpression;

public class LambdaMathExample {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        
        MathOperation subtract = (a, b) -> a - b;

        System.out.println("5 + 3 = " + operate(5, 3, add));

        System.out.println("5 - 3 = " + operate(5, 3, subtract));
    }

 interface MathOperation {
    int operate(int a, int b);
}
   

    private static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
    

@FunctionalInterface
interface Exp{
void show();
default void data1(){
    System.out.println("data.....");
}

}

class demoDriver {
    public static void main(String[] args) {
        Exp imp = () -> System.out.println("we are child");
        imp.show();
        imp.data1();
        System.out.println(imp);


        // int a = 9;
        // int b = 10;
        // int i = (a, b) -> (a+b);
        // System.out.println(i);
    }
   


}
