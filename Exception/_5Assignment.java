package Exception;

/*
21. Write a Java program to create a method that takes an integer as a 
parameter and throws an exception if the number is odd. */

public class _5Assignment {
     
    void showNumber(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        _5Assignment ob = new _5Assignment();
       int a = 3;
       if(a%2 != 0){
        throw new RuntimeException("Number is odd");
       } else{
         ob.showNumber(a);
       }
    }
    
}
