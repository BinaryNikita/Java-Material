package Array;
//Find the contiguous subarray with the maximum sum.

public class KadaneSAlgorithm {
    public static void main(String args[]) {
        int[] arr = { 1, 3, 1, 5, 6, 8 };
        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 0; i < arr.length; i++) {

            currentMax = Math.max(arr[i], currentMax + arr[i]);
            globalMax = Math.max(globalMax, currentMax);

        }
        System.out.println(globalMax);

    }
}

