package Array;

public class Duplicate {
    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 1, 3, 4, 4, 2 };
        findDuplicates(arr);

    }
}
