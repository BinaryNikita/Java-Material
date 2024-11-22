package assgn;
import java.util.Scanner;
class FirstNumber{
    int rem;

    public void firstNumberGiver(int num){
        while(num != 0){
            rem = num%10;
            num /= 10; 
        }
        System.out.println(rem);
        
    }

}
class FirstNumberExecution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FirstNumber ob = new FirstNumber();
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        ob.firstNumberGiver(a);

        
    }
}

