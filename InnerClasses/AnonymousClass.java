package InnerClasses;

 interface Person2{
   void show();
}
// class Student implements Person2{
//   public void show(){
//     System.out.println("Hello Student");
//   }
// }

public class AnonymousClass {
  public static void main(String[] args) {
    
    Person2 p1 = new Person2() {
  
      @Override
      public void show() {
       System.out.println("hello anonymous");
      }
      
    };

    p1.show();

    Person2 p2 = new Person2() {
      @Override
      public void show(){
        System.out.println("Hello anonymous 2");
      }
    };

    p2.show();
  }


    }   
