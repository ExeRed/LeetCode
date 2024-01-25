package org.example.MergeSortedArray;


import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int count = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[count];
            count++;
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println("example 1:");
        for (int i = 0; i < 6; i++) {
            System.out.println(nums1[i]);
        }

        int[] nums3 = {4,5,6,0,0,0};
        int[] nums4 = {1,2,3};
        merge(nums3, 3, nums4, 3);
        System.out.println("example 2:");
        for (int i = 0; i < 6; i++) {
            System.out.println(nums1[i]);
        }
    }

}
