 package Arrays;
import java.util.Scanner;
 public class MultidimensionalArray {
    
    public static void main(String[] args) {
        int[][] arr = {
            {12, 12, 89},
            {1, 2, 7},
            {89, 7, 2, 1, 5, 6},
            {89, 21, 45, 65}
        };

        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num  + " ");
            }
            System.out.println();
        }
    }
}

class UserInputArray{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.println("Enter the number of coloms: ");
    int col = sc.nextInt();
    int[][] arr = new int[rows][col];

    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++){
            System.out.println("Enter array elements: ");
            arr[i][j] = sc.nextInt();
        }
        System.out.println();
    }
for(int[] a: arr){
    for(int b: a){
        System.out.print(b + " ");
    }
    System.out.println();
}
}
}
//Jagged Array
/*int arr_name[][] = new int[][]  {
                                  new int[] {10, 20, 30 ,40},
                                  new int[] {50, 60, 70, 80, 90, 100},
                                  new int[] {110, 120}
                                      };
                                      
                              OR                                     
                                                         
                    int[][] arr_name = {
                          new int[] {10, 20, 30 ,40},
                          new int[] {50, 60, 70, 80, 90, 100},
                          new int[] {110, 120}
                              };
                              
                              OR                                     
                                                         
                    int[][] arr_name = {
                           {10, 20, 30 ,40},
                           {50, 60, 70, 80, 90, 100},
                           {110, 120}
                              }; */
