package Array;

public class MoveZeroestoEnd {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 4};
        int k = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }


        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}