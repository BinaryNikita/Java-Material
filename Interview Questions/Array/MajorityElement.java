package Array;

import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int[] arr) {
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == arr.length / 2) {
                ind = i;
            }
        }
        return arr[ind];
    }

    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        return nums[mid];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 9, 2, 9, 2, 9, 9 };

        System.out.println(majorityElement2(arr));

    }
}
