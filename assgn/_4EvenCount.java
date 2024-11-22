package assgn;
import java.util.Scanner;
class EvenCount{
    public void CountEven(int num){
        int allCount = 0;
        int count = 0;
        int rem;
        while(num != 0){
            rem = num%10;
            allCount++;
            num /= 10;
            if(rem%2 == 0){
                count++;
            }
        }
        if (count == allCount){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}

class EvenOdd {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      EvenCount ob = new EvenCount();
      System.out.println("Enter a number:");
      int n = sc.nextInt();
      ob.CountEven(n);

        
        
    }
    
}
