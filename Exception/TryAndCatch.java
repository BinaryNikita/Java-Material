package Exception;

public class TryAndCatch {
    public static void add(int a, int b){
         System.out.println(a+b);
        }
    public static void main(String[] args) {
        try{
            System.out.println("Hi");
            System.out.println(10/0);
        } catch(ArithmeticException e){
            // e.printStackTrace(); 
            // System.out.println(e);
            // System.out.println(e.toString()); 
            System.out.println(e.getMessage());
  
             }
        System.out.println("Hello");

       
        try{
            add(1,5);

        } catch(Exception e){
            System.out.println(e);
        }
    }
}

/*The printStackTrace() method in Java is a tool used 
to handle exceptions and errors. It is a method of Java's 
throwable class which prints the throwable along with other 
details like the line number and class name where the exception 
occurred. printStackTrace() is very useful in diagnosing exceptions.
 */