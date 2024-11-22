package assgn;

class A {
   
  public void showData(){
System.out.println("Hello");
    }
}

class B extends A{

 public void showState(){
    showData();
 }


}


public class Inheritance {
public static void main(String[] args) {
    B ob = new B();
    ob.showState();
}
    
}
