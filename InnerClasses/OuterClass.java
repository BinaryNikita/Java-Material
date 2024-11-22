package InnerClasses;



public class OuterClass {
    int a = 90;
    int b = 89;
    
  
      class InnerClass {

        int a = 89;
        int b = 90;
        void add(int a, int b){
            this.a = a;
            this.b = b;
            System.out.println(a+b);
            System.out.println(OuterClass.this.a + OuterClass.this.b);
        }

        final static int NUM = 9;
        void showFinal(){
System.out.println(NUM);
        }
        
      }
      public static void main(String[] args) {
        OuterClass o = new OuterClass();
          OuterClass.InnerClass i = o.new InnerClass();
          i.add(80, 9);
          i.showFinal();
      }
}

