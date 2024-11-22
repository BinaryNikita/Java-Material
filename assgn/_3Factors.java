package assgn;
 import java.util.Scanner;
 class Factors {
    int num;
    int fact;
    public void factorFinder(int num){
        // int n = num;
        while(num%3 == 0){

            System.out.print("3 * ");
            num = num/3;
         } 

       System.out.print(num+ " ");
        
    }
    
}
class FactorsMain{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Factors ob = new Factors();
    System.out.println("Enter a number");
    int n = sc.nextInt();
    ob.factorFinder(n);

}

}
