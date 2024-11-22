package Exception;
import java.util.Scanner;
/*19 Write a program for user defined Exception that checks 
the external and internal marks if the
internal marks is greater than 40 it raise the exception internal
 mark is exceed, if the external
mark is greater than 60 exception is raised and display 
the message the external marks is exceed, create the above 
exception and use it in your program.
 */
class MarksException extends RuntimeException{
    String msg;
    MarksException(String msg){
        super(msg);
    }
}

public class _3Assignment {
public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your internal marks: ");
int internalMarks = sc.nextInt();
System.out.println("Enter your external marks: ");
int externalMarks = sc.nextInt();
try{
    if(internalMarks > 60){
        throw new MarksException("Internal Marks is greater than 60");
    } else {
        System.out.println("Internal marks: " + internalMarks);
    }

} catch(Exception e){
    System.out.println(e);
}

try{

    if(externalMarks > 40){
        throw new MarksException("External Marks is greater than 40");
    } else {
        System.out.println("External Marks: " + externalMarks);
    }
} catch(Exception e){
    System.out.println(e);
}

}

    
}
