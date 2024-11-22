package InnerClasses;

public class InnerInheritance {

    void m2(){

        class Inner1 {

        void sub(int a, int b){
           System.out.println(a-b);
        }
       }
    
    
       class Inner2 extends Inner1{
          void add(int a, int b){
           System.out.println(a+b);
          }
       }
       
       Inner2 inner = new Inner2();
       inner.add(34, 7);
    }



    
    public static void main(String[] args) {
        InnerInheritance o = new InnerInheritance();
        o.m2();
        }
    }
    
    

