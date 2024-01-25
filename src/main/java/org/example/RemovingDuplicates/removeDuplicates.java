package org.example.RemovingDuplicates;

import java.util.HashMap;

public class removeDuplicates {
    public static int removeDuplicates(int[] nums){
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int expectedLen1 = removeDuplicates(nums1);
        System.out.println("Example 1: " + expectedLen1);

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedLen2 = removeDuplicates(nums2);
        System.out.println("Example 2: " + expectedLen2);

    }
}
