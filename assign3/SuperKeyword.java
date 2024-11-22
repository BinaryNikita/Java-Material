package assign3;
class Animal {
   String color = "Red";
   String name = "Nik";
     Animal(){
      System.out.println(color);
     }
     void move() {
      System.out.println(color);
       System.out.println("Animals can move");
    }


    Animal(String color){
      this.color = color;
      System.out.println(color);
      System.out.println("Inside animal");
    }
    
 }

 
 class Dog extends Animal {
String name = super.name;

  int age = 21;
 Dog(String color, int age){
   super(color);
  this.age=age;
  System.out.println("Inside child "+ color + "  " +  age);


 }

 

    public void move() {
      System.out.println(super.color);
       System.out.println("Dogs can walk and run");


       super.move();
    }
 }
 
 class SuperKeyword {
 
    public static void main(String args[]) { 
      Dog c = new Dog("Orange", 32); 
      Animal b = new Dog("Red", 5);
      System.out.println(c.name);
          //  Dog c = new Dog("Red");   
          //  c.move();
    }
   }