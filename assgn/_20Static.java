package assgn;

 class StaticKeyword{
    static int a = 9;
    static int b = 9;
    static void sub(){
    System.out.println(a-b);
    }
     static void add(int a , int b){
        final int c = a + b;
          System.out.println(c);
        //   sub();
      }

}

class Static extends StaticKeyword{
static void add(int a, int b){
    System.out.println(a-b);
}    
}


public class _20Static {
    public static void main(String[] args) {
        StaticKeyword a = new StaticKeyword();
        // StaticKeyword.sub();
        // StaticKeyword.add(2, 9);
        
        // StaticKeyword.add(num1, num2);
        // Static.add(54, 7);
        int num1 = 7;
        int num2 = 9;
        StaticKeyword.add(num1, num2);

    }
    
}



