package assgn;

public interface  Walkable {
  
  void walk(int a, int b);
  default void swim(){
    System.out.println("swimming a");
  }
     
}
public interface Swim {
void walk();
default void swim(){
  System.out.println("swimming b");
}
    
}  
 
public interface Buffalo extends Walkable{
 static void walk(){
  System.out.println("Buffalo is walking");
 }
  

 public interface Cow extends Walkable {
 static void Eat(){
  System.out.println("Cow is Eating");
 }
 default void walk(){
  System.out.println("Cow is walking");
 }
  
 }
}

 puclass Duck implements Swim, Walkable{
  public void walk(int speed, int steps){
       System.out.println(speed + "per hour " + steps);
  }
  public void walk(){
    System.out.println("Duck is walking");
  }

@Override
public void swim() {
    Swim.super.swim();
}
 }

 public class _19Interface {
public static void main(String[] args) {
  Duck d1 = new Duck();
  d1.walk();
  d1.swim();
  d1.walk(10, 1000);
} 

 }

