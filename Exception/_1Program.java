package Exception;
import java.util.Scanner;
public class _1Program {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String name = null;
        try{
            System.out.println((float)10/n);
            
        } 
        
        catch(ArithmeticException e){
            System.out.println(e);
        } 

        try{
            System.out.println(name.length());
             
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
      System.out.println("hello"); 
        
        
    }
}
