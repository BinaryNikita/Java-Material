package Exception;
import java.util.Scanner;
/*26. Write a Java program that reads a list of integers from the 
user and throws an exception if
any numbers are duplicates. */
class DuplicatesException extends RuntimeException{
    String msg;
    DuplicatesException(String msg){
     super(msg);
    }
}


class _6Assignmenet{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
             System.out.println("Enter size of array");
             int size = sc.nextInt();
             int[] arr = new int[size];
             for(int i = 0; i < arr.length; i++){
                 System.out.println("Enter a number");
                 arr[i] = sc.nextInt();
               
             }

             for(int i = 0; i < arr.length; i++){
                if(arr[i] == arr[i+1]){
                    throw new DuplicatesException("Duplicate values in list"); 
                }
             }
    }
}

     





















