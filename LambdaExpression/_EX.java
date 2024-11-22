package LambdaExpression;

interface Square{
    int calculate(int x);
}

public class _EX{
public static void main(String args[]){
    int x = 10;
    Square result = (int a) -> a * a;
    System.out.println(result.calculate(x));
}
    
}

class RoughOuter{
    {
     int x = 10;
    }
    public static void main(String args[]){

        Square result = (int a) -> a * a;
        System.out.println(result.calculate(x));
    }
}