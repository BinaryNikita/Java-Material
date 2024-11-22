package Exception;
import java.util.Scanner;

class NegativeRadius extends RuntimeException{
    NegativeRadius(String msg){
        super(msg);
    }
}

abstract class Shape1 {
abstract void area(int radius);
    
}

class Circle1 extends Shape1{
    void area(int radius) throws NegativeRadius{
        if(radius < 0){
            throw new NegativeRadius("Negative value for radius");
        }
    final double pi = 3.14;
    double area = pi *  radius * radius;
    System.out.println(area);
  }
}

class Rectangle1 extends Shape1{
    void area(int radius) throws NegativeRadius{
        if(radius < 0){
            throw new NegativeRadius("Negative value for radius");
        }
        final double pi = 3.14;
        double area = 2*pi*radius;
        System.out.println(area);
      } 
}


public class _8Assignment {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter radius: ");
int radius = sc.nextInt();
Rectangle1 r = new Rectangle1();
r.area(radius);
Circle1 c = new Circle1();
c.area(radius);
}  
}