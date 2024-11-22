package Exception;
import java.util.Scanner;
/*27. Write a Java program to create a method that takes a string 
as input and throws 
an exception if the string does not contain vowels. */

class NoVowel extends RuntimeException{
    NoVowel(String msg){
        super(msg);
    }
}
public class _7Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'A' 
            || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U'){
                count++;
            }
        }

        if(count == 0){
            throw new NoVowel("The string contains no vowels");
        }
    }
}
