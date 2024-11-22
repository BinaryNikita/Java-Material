package src;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a operation to perform: ");
        System.out.println("1. Create \n" + "2. Read \n" + "3. Update \n" + "4. Delete \n" + "5. Exit" );
        int choice = sc.nextInt();


        switch (choice) {
            case 1:
            
                break;
            case 2:
            ReadOperation.readOperation();
                break;
            case 3:
                break;
            case 4:
                break;

            case 5:
            break;
        
            default:
System.out.println("Invalid choice");
System.out.println("Enter a operation to perform: ");
System.out.println("1. Create \n" + "2. Read \n" + "3. Update \n" + "4. Delete \n" + "5. Exit" );
choice = sc.nextInt();

        }
    }
}
