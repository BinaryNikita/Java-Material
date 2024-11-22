package assgn;
import java.util.Scanner;
class Consecutive{
    public void consecutive(int a, int b, int c){
        if(b == ++a && c == ++b){
            System.out.println("It's a consecutive number.");
        } else{
            System.out.println("It's not a consecutive number.");
        }
    }

}

class Driver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consecutive ob = new Consecutive();
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();
        ob.consecutive(num1, num2, num3);



        
    }
    
}