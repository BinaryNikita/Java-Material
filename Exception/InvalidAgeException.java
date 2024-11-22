package Exception;
import java.util.Scanner;
class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String msg){
        super(msg);
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter age: ");
      int age = sc.nextInt();
      if(age < 18){
        throw new InvalidAgeException("You are not eligible to vote.");
      } 
    }
}

class InvalidAgeDriver{
    // public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
    //   System.out.println("Enter age: ");
    //   int age = sc.nextInt();
    //   if(age < 18){
    //     throw new InvalidAgeException("You are not eligible to vote.");
    //   }  
    //   else  {
    //       System.out.println("Another Exception");
    //   }
    }
// }


