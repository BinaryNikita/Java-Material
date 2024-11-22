package Array;

public class MissingNumber {

    public static void findMissingNumber(int[] arr){
        int ind = 0;

        for(int i = arr[0]; i <= arr[arr.length-1]; i++){
            if(arr[ind] != i){
                System.out.println("Missing number: " + i);
            } else {
                ind++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6};
        int arr2[] = {1, 3, 4, 5, 6, 8, 10};
        int arr3[] = {1, 0, 1, 0};
        
        findMissingNumber(arr);
        System.out.println();
        findMissingNumber(arr2);
        System.out.println();
        findMissingNumber(arr3);
    }
}
