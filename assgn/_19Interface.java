package assgn;

// import assgn.Cow;
@FunctionalInterface
interface  Walkable {
  
  void walk(int a, int b);
  default void run(){
    System.out.println("Eating");
  }
  void runner();
     
}
interface Swim {
void walk();
default void run(){
  System.out.println("swimming b");
}
    
}  

// class Duck implements Swim, Walkable{
//   public void walk(int speed, int steps){
//        System.out.println(speed + "per hour " + steps);
//   }
//   public void walk(){
//     System.out.println("Duck is walking");
//   }

// @Override
// public void run() {
//     Swim.super.run();
// }
//  }

 
// interface Buffalo extends Walkable{
//  static void walk(){
//   System.out.println("Buffalo is walking");
//  }
  

 interface Cow extends Walkable {
    int a = 9;
 static void Eat(){
  System.out.println("Cow is Eating");
  System.out.println(a);
  int a = 9;
 }
 default void walk(){
  System.out.println("Cow is walking");
 }
  
 }
// }


public class _19Interface {
public static void main(String[] args) {
//   Duck d1 = new Duck();
//   d1.walk();
// //   d1.swim();
//   d1.walk(10, 1000);
  Cow.Eat();
} 

 }

