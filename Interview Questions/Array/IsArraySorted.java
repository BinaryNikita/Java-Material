package Array;

public class IsArraySorted {
  
    public static void ifArraySorted(int[] arr){
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;  
            }
            if (arr[i] > arr[i + 1]) {
                ascending = false;  
            }
        }

        if (ascending) {
            System.out.println("The array is sorted in ascending order");
        } else if (descending) {
            System.out.println("The array is sorted in descending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {7, 6, 5, 4, 3, 2, 1};
        int[] arr3 = {1, 2, 0, 1};
        ifArraySorted(arr);
        ifArraySorted(arr2);
        ifArraySorted(arr3);
    }
}
